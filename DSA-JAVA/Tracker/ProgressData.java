import java.io.*;
import java.util.*;

public class ProgressData {

    // =========================
    // FILE WHERE PROGRESS IS SAVED
    // =========================

    private static final String FILE_NAME = "progress.dat";


    // =========================
    // DATA
    // =========================

    public boolean[] theoryDone;

    public int[] easySolved;
    public int[] mediumSolved;
    public int[] hardSolved;


    // =========================
    // CONSTRUCTOR
    // =========================

    public ProgressData(int numberOfTopics) {

        theoryDone = new boolean[numberOfTopics];

        easySolved = new int[numberOfTopics];
        mediumSolved = new int[numberOfTopics];
        hardSolved = new int[numberOfTopics];
    }


    // =========================
    // SAVE PROGRESS
    // =========================

    public void save() {

        try {

            FileOutputStream file =
                    new FileOutputStream(FILE_NAME);

            ObjectOutputStream output =
                    new ObjectOutputStream(file);


            output.writeObject(theoryDone);
            output.writeObject(easySolved);
            output.writeObject(mediumSolved);
            output.writeObject(hardSolved);


            output.close();
            file.close();

            System.out.println("\n💾 Progress saved successfully!");

        } catch (IOException e) {

            System.out.println(
                    "\n❌ Error saving progress: "
                    + e.getMessage()
            );
        }
    }


    // =========================
    // LOAD PROGRESS
    // =========================

    public boolean load() {

        File file = new File(FILE_NAME);

        // No saved progress yet
        if (!file.exists()) {

            System.out.println(
                    "\n🆕 No previous progress found."
            );

            return false;
        }


        try {

            FileInputStream inputFile =
                    new FileInputStream(FILE_NAME);

            ObjectInputStream input =
                    new ObjectInputStream(inputFile);


            theoryDone =
                    (boolean[]) input.readObject();

            easySolved =
                    (int[]) input.readObject();

            mediumSolved =
                    (int[]) input.readObject();

            hardSolved =
                    (int[]) input.readObject();


            input.close();
            inputFile.close();


            System.out.println(
                    "\n📂 Previous progress loaded!"
            );

            return true;

        } catch (IOException | ClassNotFoundException e) {

            System.out.println(
                    "\n❌ Error loading progress: "
                    + e.getMessage()
            );

            return false;
        }
    }


    // =========================
    // RESET ALL PROGRESS
    // =========================

    public void reset(int numberOfTopics) {

        theoryDone =
                new boolean[numberOfTopics];

        easySolved =
                new int[numberOfTopics];

        mediumSolved =
                new int[numberOfTopics];

        hardSolved =
                new int[numberOfTopics];


        // Delete saved file

        File file = new File(FILE_NAME);

        if (file.exists()) {
            file.delete();
        }


        System.out.println(
                "\n🗑️ All progress has been reset!"
        );
    }
}
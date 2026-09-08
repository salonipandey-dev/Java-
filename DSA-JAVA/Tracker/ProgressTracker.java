import java.util.*;

public class ProgressTracker {

    static Scanner sc = new Scanner(System.in);

    // =========================
    // DSA TOPICS
    // =========================

    static String[] topics = {
        "Fundamentals",
        "Maths",
        "Patterns",
        "Recursion",
        "Arrays",
        "Strings",
        "Searching",
        "Sorting",
        "Bit Manipulation",
        "Hashing",
        "Two Pointer",
        "Sliding Window",
        "Prefix Sum",
        "Backtracking",
        "Linked List",
        "Stack",
        "Queue",
        "Deque",
        "Binary Tree",
        "BST",
        "Heap",
        "Graph",
        "Greedy",
        "DP",
        "Number Theory",
        "Trie",
        "String Matching",
        "Range Query"
    };


    // =========================
    // PROGRESS DATA
    // =========================

    static ProgressData data;


    // =========================
    // MAIN
    // =========================

    public static void main(String[] args) {

        // Create progress object
        data = new ProgressData(topics.length);

        // Load previous progress
        data.load();

        while (true) {

            showMenu();

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    showProgress();
                    break;

                case 2:
                    completeTheory();
                    break;

                case 3:
                    addProblem();
                    break;

                case 4:
                    showTopicProgress();
                    break;

                case 5:
                    resetProgress();
                    break;

                case 0:
                    data.save();
                    System.out.println("\n👋 Goodbye! Keep grinding DSA! 🔥");
                    return;

                default:
                    System.out.println("\n❌ Invalid choice.");
            }
        }
    }


    // =========================
    // MENU
    // =========================

    static void showMenu() {

        System.out.println("\n====================================");
        System.out.println("       🧠 DSA JAVA TRACKER");
        System.out.println("====================================");

        System.out.println("1. 📊 View Overall Progress");
        System.out.println("2. 📚 Complete Theory");
        System.out.println("3. 💻 Add Solved Problem");
        System.out.println("4. 📖 View Topic Progress");
        System.out.println("5. 🗑️ Reset Progress");
        System.out.println("0. 🚪 Exit");

        System.out.print("\nChoose: ");
    }


    // =========================
    // OVERALL PROGRESS
    // =========================

    static void showProgress() {

        int completedTheory = 0;

        int easy = 0;
        int medium = 0;
        int hard = 0;

        for (int i = 0; i < topics.length; i++) {

            if (data.theoryDone[i]) {
                completedTheory++;
            }

            easy += data.easySolved[i];
            medium += data.mediumSolved[i];
            hard += data.hardSolved[i];
        }

        int totalProblems = easy + medium + hard;

        double theoryPercentage =
                ((double) completedTheory / topics.length) * 100;


        System.out.println("\n====================================");
        System.out.println("          📊 YOUR PROGRESS");
        System.out.println("====================================");

        System.out.printf(
                "Theory Progress: %.1f%%\n",
                theoryPercentage
        );

        System.out.println("\nProblems Solved:");
        System.out.println("🟢 Easy   : " + easy);
        System.out.println("🟡 Medium : " + medium);
        System.out.println("🔴 Hard   : " + hard);
        System.out.println("🔥 Total  : " + totalProblems);

        System.out.println(
                "\nTheory: " +
                completedTheory +
                " / " +
                topics.length
        );

        System.out.println("====================================");
    }


    // =========================
    // COMPLETE THEORY
    // =========================

    static void completeTheory() {

        showTopics();

        System.out.print("\nEnter topic number: ");

        int choice = sc.nextInt();

        if (choice < 1 || choice > topics.length) {

            System.out.println("\n❌ Invalid topic.");
            return;
        }

        int index = choice - 1;

        data.theoryDone[index] = true;

        data.save();

        System.out.println(
                "\n✅ Theory completed: " +
                topics[index]
        );
    }


    // =========================
    // ADD SOLVED PROBLEM
    // =========================

    static void addProblem() {

        showTopics();

        System.out.print("\nEnter topic number: ");

        int topicChoice = sc.nextInt();

        if (topicChoice < 1 || topicChoice > topics.length) {

            System.out.println("\n❌ Invalid topic.");
            return;
        }

        int index = topicChoice - 1;


        System.out.println("\nDifficulty:");

        System.out.println("1. 🟢 Easy");
        System.out.println("2. 🟡 Medium");
        System.out.println("3. 🔴 Hard");

        System.out.print("Choose difficulty: ");

        int difficulty = sc.nextInt();


        switch (difficulty) {

            case 1:
                data.easySolved[index]++;
                break;

            case 2:
                data.mediumSolved[index]++;
                break;

            case 3:
                data.hardSolved[index]++;
                break;

            default:
                System.out.println(
                        "\n❌ Invalid difficulty."
                );

                return;
        }


        // SAVE AUTOMATICALLY
        data.save();


        System.out.println(
                "\n🎉 Problem recorded!"
        );

        System.out.println(
                "Topic: " +
                topics[index]
        );
    }


    // =========================
    // TOPIC PROGRESS
    // =========================

    static void showTopicProgress() {

        System.out.println("\n====================================");
        System.out.println("          📚 TOPIC PROGRESS");
        System.out.println("====================================");


        for (int i = 0; i < topics.length; i++) {

            int totalProblems =
                    data.easySolved[i]
                    + data.mediumSolved[i]
                    + data.hardSolved[i];


            String theoryStatus =
                    data.theoryDone[i]
                    ? "✅"
                    : "⬜";


            System.out.println(
                    (i + 1) +
                    ". " +
                    theoryStatus +
                    " " +
                    topics[i] +
                    " | Problems: " +
                    totalProblems
            );
        }
    }


    // =========================
    // RESET PROGRESS
    // =========================

    static void resetProgress() {

        System.out.print(
                "\n⚠️ Are you sure? (yes/no): "
        );

        String answer = sc.next();


        if (answer.equalsIgnoreCase("yes")) {

            data.reset(topics.length);

        } else {

            System.out.println(
                    "\n👍 Progress kept safely."
            );
        }
    }


    // =========================
    // SHOW TOPICS
    // =========================

    static void showTopics() {

        System.out.println("\n========== DSA TOPICS ==========");

        for (int i = 0; i < topics.length; i++) {

            System.out.println(
                    (i + 1) +
                    ". " +
                    topics[i]
            );
        }
    }
}
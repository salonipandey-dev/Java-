package JAVAOFFICIAL.DSA.Arrays.BinarySearch;

public class BinarySearchMatrix
{
    public static void main(String[] args)
    {
        int[][] matrix={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[] result = search(matrix, 5);
        System.out.println("Element found at: [" + result[0] + ", " + result[1] + "]");

    }
    static int[] search(int[][] matrix,int target)
    {
        int row=0;
        int col=matrix.length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==target)
            {
                return new int[]{row,col};
            }
            else if(matrix[row][col]<target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
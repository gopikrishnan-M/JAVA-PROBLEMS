package problems;

import java.util.Arrays;

public class MatrixBSearch {
    public static void main(String[] args) {
        //this is only applicable only to array which has row wise column wise sorted
        //which literally mean every single element in a row+1 is greater than row similarly column
        int[][] matrix={
                {2,3,4, 5, 6 },
                {3,7,8 ,9 ,7 },
                {5,8,10,11,12},
                {12,23,34,45,56}
        };
        int target=2;
        System.out.println(Arrays.toString(bSearch(matrix,target)));
    }

    private static int[] bSearch(int[][] matrix, int target) {
        int row=0;
        int col= matrix[row].length-1;
        while(row<= matrix.length&&col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            else if (target>matrix[row][col]) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }

}

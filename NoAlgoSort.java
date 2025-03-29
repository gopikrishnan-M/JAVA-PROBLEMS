package problems;

import java.util.Arrays;

public class NoAlgoSort {
    public static void main(String[] args) {
        int[]  arr={2,0,1,2,0,1,1};
        NoAlgoSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void NoAlgoSort(int[] arr) {
        int[] occur=new int[3];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) occur[0]++;
            else if(arr[i]==1) occur[1]++;
            else occur[2]++;
        }
        int i=0;
        while(i<occur[0]){
            arr[i++]=0;
        }
        while(i<occur[0]+occur[1]){
            arr[i++]=1;
        }
        while(i<occur[0]+occur[1]+occur[2]){
            arr[i++]=2;
        }
        /*instead of multiple while loops we can use
        * for (int i = 0; i < occur.length; i++) {
            Arrays.fill(arr, index, index + occur[i], i);
            index += occur[i];
        }*/

        /*
        * for avoiding space complexity use the below one
         *private static void sortColors(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;

    while (mid <= high) {
        if (arr[mid] == 0) {
            swap(arr, low++, mid++);
        } else if (arr[mid] == 1) {
            mid++;
        } else {
            swap(arr, mid, high--);
        }
    }
}

private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
 */
    }
}

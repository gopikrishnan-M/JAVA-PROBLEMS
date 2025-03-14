package problems;

import java.util.Arrays;

class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }



    public static int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]==arr[correct]){
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return arr[j];
            }
        }
        return -1;
    }
}
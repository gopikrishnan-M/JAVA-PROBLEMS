package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int []arr={1,2,3,2,3,5,1,5,9,4,2,6,8,2,5};
        ArrayList<Integer> res =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!res.contains(arr[i]))
                res.add(arr[i]);
        }
        System.out.println(res.toString());
    }



    //ten kulla irrukanum and order change aagum but answer correct ha irrukum.
    public static void onlyLessThanTen(){
        int k=0;
        int[] arr ={1,2,3,2,3,5,1,5,9,4,2,6,8,2,5};
        int[] occur=new int[10];
        int[] res=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            occur[arr[i]]++;
        }
        for(int i=0;i< occur.length;i++){
            if(occur[i]>0){
                res[k++]=i;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

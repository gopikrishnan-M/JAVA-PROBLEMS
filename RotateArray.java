package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int arr[]={21,54,1,21,58,545,1,8,0,68,13};
        System.out.print("Enter the rotate value less than "+arr.length+" but not less than zero >_<");
        Scanner sc=new Scanner(System.in);
        int rotateValue =sc.nextInt();
        rotateValue=rotateValue%(arr.length);// ip value greater than arr length.

        int res[]=new int[arr.length];
        int r=0;
        for(int i=0;i< arr.length;i++){
            res[r++]=arr[rotateValue];
            if(rotateValue <arr.length-1)
                rotateValue++;
            else
                rotateValue =0;
        }
        System.out.println(Arrays.toString(res));
    }
    static void usingArrList(){
        Integer []arr={0,1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of key:");
        int key = sc.nextInt()%11;
        for (int i = 0; i <key ; i++) {
            int str=  list.remove(0);

            list.add(str);
        }
        System.out.println(list);
    }

}

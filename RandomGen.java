package problems;

import java.util.Arrays;

public class RandomGen {
    public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++) {
            arr[i]=mathRandom();
        }
        System.out.println(Arrays.toString(arr));
    }
    //randomly return a double value between 0-1
    public static int mathRandom(){

        double random=Math.random();
        return (int) (random*10);
    }
    /*
     using random function
     public static void randF(){
         Random rand =new Random();
         int randomInt = rand.nextInt(100);
         }
    */


}

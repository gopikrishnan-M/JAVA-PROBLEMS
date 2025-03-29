package problems;

import java.util.ArrayList;
//brute force
//see at the end to find the best one
class NumberGame {
    public static void main(String[] args) {
        int[] arr={5,4,3,2};
        ArrayList<Integer> mod=new ArrayList<>();
        for(int n:arr){
            mod.add(n);
        }
        for(int n:Game(mod)){
            System.out.println(n +",");
        }
    }
    public static ArrayList<Integer> Game(ArrayList<Integer> mod) {
        ArrayList<Integer> ans=new ArrayList<>();
        while (!mod.isEmpty()){
            //alice turn
            int aliceMin=mod.get(minFinder(mod));
            mod.remove(minFinder(mod));
            //bob turn
            int bobMin=mod.get(minFinder(mod));
            mod.remove(minFinder(mod));
            //bob add
            ans.add(bobMin);
            //alice add
            ans.add(aliceMin);
        }
        return ans;
    }

    private static int minFinder(ArrayList<Integer> mod) {
        int min=0;
        for (int i = 1; i < mod.size(); i++) {
            if(mod.get(i) < mod.get(i-1)){
                min=i;
            }
        }
        return min;
    }
/* simply do this :)
  public static int[] easyWay(int[] nums){
        Arrays.sort(nums);
        for(int i=0 ; i < nums.length ; i=i+2){
        int temp=nums[i];
        nums[i]=nums[i+1];
        nums[i+1]=temp;
       }
       return nums;
  }*/
}
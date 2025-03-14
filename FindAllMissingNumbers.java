package problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findDisappearedNumbers(arr));

    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
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
        ArrayList<Integer> ans=new ArrayList<>();
        for (int j = 0; j <arr.length; j++) {
            if(arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    public static List<Integer> anotherWay(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(arr);
        for (int j = 0; j <arr.length; j++) {
            if(arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
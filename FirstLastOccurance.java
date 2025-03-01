package problems;

public class FirstLastOccurance {
    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6,7,7,7,7,8,8,9,9,9};
        int[] res=new int[2];
        int target=7;
        res[0]=firstLastOccurance(arr,target,true);
        if(res[0]!=-1) {
            res[1] = firstLastOccurance(arr, target, false);
        }
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    private static int firstLastOccurance(int[] arr, int target, boolean findFirst) {
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<arr[mid]){
                high=mid-1;
            } else if (target>arr[mid]) {
                low=mid+1;
            }
            else{
                ans=mid;
                if(findFirst){
                   high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return ans;
    }
}

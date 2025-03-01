package problems;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,8,9,12,14,15,17,23,25,28,36,38,39,45,48,56,59,61,72,83,95};
        int target=5;
        int low=0;
        int high=1;
        int ans=-1;
        while(target>arr[high]){
            int newStart=high+1;
            high=low+(high-low+1)*2;
            low=newStart;
            ans = BinarySearch(arr, target, low, high);
        }
        System.out.println("the target is found at position   "+ ans);


    }

    static int BinarySearch(int[] arr,int target,int low,int high){
        int indx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                indx=mid;
                break;
            }
            else if (arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return indx;
    }
}

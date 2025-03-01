package problems;
//given a mountain array of elements which means there will be a peak element up to which values ascend then values descend

public class MountainFirstOccur {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,8,9,10,12,23,34,544,67,62,7,5,4,3,2};
        int target=62;
        int peak=findPeak(arr);//this function find the peak element
        int ans=twoWayBinarySearch(arr,target,0,peak);//first we search for target in array upto target
        //if target is not found at ascending part
        // then we are searching at descending part of the array
        if(ans==-1){

            ans=twoWayBinarySearch(arr,target,peak,arr.length-1);
        }
        System.out.println("the element is found at "+ ans);
    }
    private static int twoWayBinarySearch(int[] arr, int target, int start, int end) {
        //this is just order agnostic binary search
        int ans=-1;
        if(arr[start]<arr[end]){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    return mid;
                } else if (arr[mid] > target) {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        else{
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    return mid;
                } else if (arr[mid] < target) {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;

    }
    private static int findPeak(int[] arr) {
        //this function returns the peak index

        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}

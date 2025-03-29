package problems;

public class BSearchInRotatedArr {
    public static void main(String[] args) {
        int[] arr={13,23,41,51,61,71,1};
        int target=4;
        //the main key is that the array will not have duplicate elements if exists my  approach might fail
        int originalEnd=originalEndFinder2(arr);
        System.out.println(originalEndFinder(arr));
        /*int ans=bnarySearch(arr,target,0,originalEnd);
        if(ans==-1){
            ans=bnarySearch(arr,target,originalEnd+1, arr.length-1);
        }
        System.out.println(ans);
*/
        System.out.println(originalEnd);
    }

    private static int bnarySearch(int[] arr, int target, int start, int end) {
        int ans=-1;
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
        return ans;
    }

    static int originalEndFinder(int[] arr){
        int start=0;
        int end=arr.length-1;
        int last=end;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[last]){
                //this statement literally find weather we are in first half or in second half
                start=mid;
                if(arr[mid]<arr[mid+1]){
                    /*in some cases it will give answer without this condition but in most of the cases
                    the loop will never terminate it will continuously assign start= mid where start will always be
                    less than the end */
                    start=mid+1;
                }
                else{
                    end=mid;

                }
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
    public static int originalEndFinder2(int[] arr){
        int s=0;
        int e=arr.length-1;
        while (s < e) {
            int m=s+(e-s)/2;
            if(m>s&& arr[m]<arr[m-1]) return m-1;
            if(m<e&& arr[m]>arr[m+1]) return m;
            if(arr[s]<arr[m]) s=m+1;
            else e=m-1;
        }
        return -1;
    }
}

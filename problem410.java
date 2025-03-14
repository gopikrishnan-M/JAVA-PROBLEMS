package problems;

public class problem410 {
    public static void main(String[] args) {
        //the maximum value of the array can be sum(arr[])
        //the minimum value of the array will be max(arr[]) coz there will be only one possibility
        int[] arr={7,2,5,10,8};
        int m=2;
        int ans=splitArray(arr,m);
        System.out.println(ans);
    }

    private static int splitArray(int[] arr, int m) {
        int start=0;
        int end=0;
        for (int num:arr) {
            start=Math.max(start,num);
            end+=num;
        }

        while(start<end){
            //similar to binary search we are doing this
            int mid=start+(end-start)/2;
            int sum=0;
            int splits=1;
            for(int num:arr){
                /* if sum value is greater than mid this means the value is close to sum of full array lemme say it this way
                so we are taking a new split i.e another part of sum tat is why split ++ ,else we continue to add in
                same sub array */
                if(sum+num>mid){
                    sum=num;
                    splits++;
                    /*here we try our every possible split combos when if condition is met from split is equal to one to
                    split less than arr.length*/
                }
                else{
                    sum+=num;
                }
                /*here in this for loop we search for the potential answer in a full range , for every loop we shrink
                the range and find the target value based on outer while loop*/
            }
            if(splits>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }

}

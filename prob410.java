package problems;

public class prob410 {
    //just tried it on my way  : (
    public static void main(String[] args) {
        int[] arr={7,2,5,8,10};
        int e1=0,s2=0;
        int ans=Integer.MAX_VALUE;
        while(e1<arr.length&&s2<arr.length){
            int max=maxFinder(arr,e1,s2);
            ans=Math.min(ans,max);
            e1++;
            s2++;
        }
        System.out.println(ans);
    }

    private static int maxFinder(int[] arr, int e1, int s2) {
        int p1=0;
        int p2=0;
        for (int i = 0; i < e1; i++) {
            p1=p1+arr[i];
        }
        for (int i = s2; i <arr.length ; i++) {
            p2=p2+arr[i];
        }
        //System.out.println(""+p2+" "+p1+" "+Math.max(p1,p2));
        return Math.max(p1,p2);
    }
}

package problems;

public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("gopikrishnan"));
    }
    public static int firstUniqChar(String s) {
        char[] arr=s.toCharArray();
        for(int i=0 ; i< arr.length ; i++){
            boolean isUniq=chkXcept(i,arr[i],arr);
            if (isUniq) return i;
        }
        return -1;
    }

    public static boolean chkXcept(int ignore, char chk, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i!=ignore&&chk==arr[i]) return false;
        }
        return true;
    }
}

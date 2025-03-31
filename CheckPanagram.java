package problems;
import java.util.ArrayList;
import java.util.HashSet;

public class CheckPanagram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram3("abcdefghijklmnopqrstuvwxyz"));
    }
    public static boolean checkIfPangram(String sentence) {
        ArrayList<Character> alfabet=new ArrayList<>();
        int l=sentence.length();
        if(l<26) return false;
        for(char c='a' ;c<='z' ;c++){
            alfabet.add(c);
        }
        for (int i=0; i< l; i++){
            alfabet.remove(Character.valueOf(sentence.charAt(i)));
        }
        return alfabet.isEmpty();
    }

    public static boolean checkIfPangram2(String s){
        int l=s.length();
        if(l<26) return false ;
        for(int i='a';i<='z';i++){
            System.out.println(s.indexOf(i));
            if(s.indexOf(i)<0){
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfPangram3(String s){
        HashSet<Character> set =new HashSet<>();
        for (char c:s.toCharArray()) {
            set.add(c);
        }
        return set.size()==26;
    }
}

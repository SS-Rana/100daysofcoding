import java.util.HashSet;

public class checkPermutation{
  
    public static boolean checkPermutation(String str1, String str2){

        HashSet <Character> set1 = new HashSet<> ();
        HashSet <Character> set2 = new HashSet<> ();
        if( str1.length() != str2.length()){
            return false;
        }
        for (char x : str1.toCharArray()){
            set1.add(x);
        }
       for (char x : str2.toCharArray()) {
            set2.add(x);
        }
        if(set1.equals(set2)){
            return true;
        }
        return false;
    }
    public static void main (String[] args){
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are they permutations? " + checkPermutation(str1, str2));
    }
}
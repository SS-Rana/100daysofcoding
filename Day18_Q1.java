import java.util.HashSet;

public class Day18_Q1 {
    public static void uniqSub(String str, int index, String newString, HashSet<String> set){
        
        if(index == str.length()){
            if(!set.contains(newString)){
                System.out.println(newString);
                set.add(newString); 
            }
            return;
        }
        char curChar = str.charAt(index);
        uniqSub(str, index+1, newString+curChar,set);

        uniqSub(str, index+1, newString,set);

    }
    public static void main (String[] args){
       HashSet <String> set = new HashSet<String>();
        String str = "aaa";
        System.out.println("The real string is "+str);
        uniqSub(str, 0, "",set);


    }
}

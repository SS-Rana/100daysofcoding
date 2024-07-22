public class Day18_Q3 {
    public static void printPermutation(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
        }
        for(int i=0; i<str.length(); i++){
            char curChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutation(newString, permutation+curChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
    }
}

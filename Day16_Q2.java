public class Day16_Q2 {
    public static String reverseString(String str, int index, String reverse){
        
        if(index == 0){
            reverse += str.charAt(index);
            return reverse;
        }
        
        reverse += str.charAt(index);
       return reverseString(str, index-1, reverse);
    }
    public static void main(String[] args) {
        String str = "abcde";
       String reveString = reverseString(str, str.length()-1,"");
        System.err.println("The string "+str+" is reversed into "+reveString);
    }
}

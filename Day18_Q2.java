public class Day18_Q2 {
    public static String[] map = {".", "abc", "def", "ghi", "jkl", 
    "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        
        char ch = str.charAt(index);
        String key = map[ch - '0'];

        for(int i=0; i<key.length(); i++){
            printComb(str, index+1, newString+key.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "34";
        printComb(str, 0, "");
    }
}

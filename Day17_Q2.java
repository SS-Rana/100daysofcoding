public class Day17_Q2 {
    public static boolean map[] = new boolean[26];
    public static void removeDup(String str, int idx, StringBuilder newStr){
       
        if(idx == str.length()){
            System.out.println("The new string after removing duplicates : "+newStr);
            return;
        }
        char ch = str.charAt(idx);
        if(!map[ch - 'a']){
            newStr.append(ch); 
            map[ch - 'a'] = true; 
        }
        
        removeDup(str, idx + 1, newStr); 
    }
    
    public static void main(String[] args) {
        String str = "aaabbccsseeffd";
        System.out.println("The original string : "+str);
        StringBuilder newStr = new StringBuilder();
        removeDup(str, 0, newStr);
    }
}

public class Day17_Q1 {
    public static void shiftX(String str, int idx, int count, StringBuilder newString){
        if(idx == str.length()){
            while(count > 0){
                newString.append('x');
                count--;
            }
            return;
        }
        
        char ch = str.charAt(idx);
        if(ch == 'x'){
            count++;
        } else {
            newString.append(ch); 
        }
        
        shiftX(str, idx + 1, count, newString);
    }
    
    public static void main(String[] args) {
        String str = "abxxdscxdxwxxdf";
        StringBuilder newString = new StringBuilder();
        
        shiftX(str, 0, 0, newString);
        System.out.println("The original string : "+str);
        System.out.println("The new string : "+newString.toString()); 
    }
}

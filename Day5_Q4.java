public class Day5_Q4 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        StringBuilder str = new StringBuilder(str1);
        int n= str1.length();
        char t1;
        char t2;
        for(int i=0 ; i<n-1; i+=2){
            t1=str.charAt(i);
            t2=str.charAt(i+1);
            str.setCharAt(i, t2);
            str.setCharAt(i+1, t1);
    
        }
        System.err.println(str);
    }
}

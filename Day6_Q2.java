public class Day6_Q2 {
    public static void main(String[] args) {
        String Str = "000He0l0lo00";
        StringBuilder sb = new StringBuilder(Str);
        for(int i=sb.length()-1; i>=0; i--){
            if(sb.charAt(i)=='0'){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(Str);
        System.out.println(sb);
    }
}

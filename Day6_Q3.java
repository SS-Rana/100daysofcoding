public class Day6_Q3 {
    public static void main(String[] args) {
        String str1 = "12345678890";
        String str2 = "54654984564";
        
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();
        
        StringBuilder str = new StringBuilder();
        

        if (str2.length() > str1.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        
        int n1 = str1.length();
       
        
        int carry = 0;
        
        for(int i=0; i<n1; i++){
            int digit1 = (int)(str1.charAt(i)-'0');
            int digit2 = (int)(str2.charAt(i)-'0');
            int sum = digit1 + digit2 + carry;
            str.append((char) (sum % 10 + '0'));
            carry = sum/10;
        }
        if(carry!=0){
            str.append((char)(carry));
        }
        
        System.out.println(str.reverse().toString()); 
    }
}

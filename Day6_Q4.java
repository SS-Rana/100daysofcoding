public class Day6_Q4 {
    public static void main(String[] args) {
        String str = "102100211";
        
       System.out.println("The sub string of "+ str+" containing equal number of 1, 2, 0 are : ");
        for (int len = 3; len <= str.length(); len++) {
            for (int i = 0; i <= str.length() - len; i++) {
                int one = 0;
                int zero = 0;
                int two = 0;
                
              
                for (int j = i; j < i + len; j++) {
                    if (str.charAt(j) == '1') {
                        one++;
                    } else if (str.charAt(j) == '2') {
                        two++;
                    } else if (str.charAt(j) == '0') {
                        zero++;
                    }
                }
             
                if (one == two && two == zero) {
                    System.err.print(str.substring(i, i + len)+"\t");
                }
            }
        }
    }
}

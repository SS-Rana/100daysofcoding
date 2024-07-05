import java.util.Scanner; 
public class Day5_Q1 {
    public static boolean ifAnagram(String str1, String str2){
        int check =0;
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0; i<str1.length(); i++){
            int key = 0;
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    key++;
                }
                
            }
            if(key==0){
                check = -1;
            }
        }
        if(check==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "silent";
        String str2 = "listen";
        boolean result = ifAnagram(str1, str2);
        if(result){
            System.out.println("The String "+str1+" and "+str2+" are Anagram");
        }
        else{
            System.out.println("The String "+str1+" and "+str2+" are not Anagram");
        }
       
        sc.close();
        }
    }


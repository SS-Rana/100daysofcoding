public class Day16_Q3 {
    public static int first = -1;
    public static int last = -1;

    public static void charOccur(char ch, String str, int index) {
        if (index == str.length()) {
            System.out.println("The first occurrence of the char "+ch+" is at index " + first);
            System.out.println("The last occurrence of the char "+ch+" is at index " + last);
            System.out.println(str);
            return;
        }
        if (str.charAt(index) == ch) {
            if (first == -1) {
                first = index;
            }
            last = index; 
        }
        charOccur(ch, str, index + 1);
    }
    public static void main(String[] args) {
        String str = "wwrfsadfsdad";
        charOccur('d', str, 0);
    }
}

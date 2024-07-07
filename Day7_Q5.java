public class Day7_Q5 {
    public static void main(String[] args) {
        int num = 8;
        int realNum = num;
       
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
       System.out.println ("The number of 1 in "+realNum+" is "+count);
    }
}

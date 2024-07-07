public class Day7_Q2 {
    public static void main(String[] args) {
        int num = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int newNum = (num | bitmask);

        System.out.printf("Using Set on %d position of the %d number we get %d",pos,num,newNum);
    }
}

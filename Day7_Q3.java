public class Day7_Q3 {
    public static void main(String[] args) {
        int num = 7;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = (~bitMask);
        int clear = notBitMask & num;
        System.out.printf("Using Clear at position %d on number %d we get %d",pos, num, clear);
    }
}

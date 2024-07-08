public class Day8_Q5 {
    public static int countSetBits(int a , int b) {
        int n = a ^ b;
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); 
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 18;
        int b = 54;
        int n = countSetBits(a, b);

        System.out.printf("Number of bits are to be change to convert %d int %d is %d",a,b,n);


    }
}

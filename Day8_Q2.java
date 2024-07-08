public class Day8_Q2 {
    public static int addUsingBit(int a, int b){
        int sum = a^b;
        int carry = (a & b)<<1;
        if(carry == 0){
            return sum;
        }
        else{
            return addUsingBit(sum, carry);
        }
    }
    public static void main(String[] args) {
        int a = 78, b =45;
        int sum = addUsingBit(a, b);
        System.out.printf("The sum of number %d and %d using bit is %d ",a,b,sum);
    }
}

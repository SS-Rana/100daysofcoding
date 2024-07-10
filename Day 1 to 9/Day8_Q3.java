public class Day8_Q3 {
    public static int addUsingBit(int a, int b) {
        int sum = a^b;
        int carry = (a & b) <<1;
        if(carry == 0){
            return sum;
        }
        else{
            return addUsingBit(sum , carry);
        }
    }
    public static int subUsingBit(int a, int b){
        int sub = addUsingBit(a, ~b);
        return addUsingBit(sub, 1);
    }
    public static void main(String[] args) {
        int  a = 45;
        int  b = 78;
        int sub = subUsingBit(a, b);
        System.out.printf("Subtraction of %d and %d using bit we get %d",a,b, sub);
    }
}

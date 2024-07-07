public class Day7_Q1 {
    public static void main(String[] args) {
        int num = 55;
        int pos = 3;
        int bitmask = num<<pos;
        if((bitmask & num)== 0){
            System.out.printf("Bit at position %d of %d number is 0",pos,num);
        }
        else{
            System.out.printf("Bit at position %d of %d number is 1",pos,num);
        }
    }
}

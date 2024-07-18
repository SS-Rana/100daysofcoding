public class Day16_Q1 {
    public static void towerOfHanoi(int num, String s, String h, String d){
        if(num==1){
            System.out.println("moving "+num+" disk from "+s+" to "+d);
            return;
        }
        towerOfHanoi(num-1, s, d, h);
        System.out.println("moving "+num+" disk from "+s+" to "+d);
        towerOfHanoi(num-1, h, s, d);
    }
    public static void main (String [] args){
        towerOfHanoi(3, "source", "helper", "destination");
    } 
}

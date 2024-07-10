class Student{
    String name;
    int roll;
    int year;

    public void printObject (){
        System.out.println("Name  "+this.name);
        System.out.println("Roll number : "+this.roll);
        System.out.println("Year: "+this.year);
    }


}
public class Day9_Q1 {
    public static void main(String[] args) {
        Student n1 = new Student();
        n1.name = "Sumit Singh Rana";
        n1.roll = 45;
        n1.year = 2;
        n1.printObject();
    }
}

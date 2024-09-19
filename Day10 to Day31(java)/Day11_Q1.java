// 4. Write a Java program to create a class called "Circle" with a radius attribute.
//  You can access and modify this attribute. Calculate the area and circumference of the circle. 

class Circle{
    private double radius;
    private static final double PI = Math.PI;

    public double getArea(){
        return PI*radius*radius;
    }
    public double getCircumference(){
        return 2*PI*radius;
    }
    Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
}
public class Day11_Q1 {
    public static void main(String[] args) {
        Circle n1 = new Circle(45.3);
        Circle n2 = new Circle(25.55);

        System.out.printf("\nThe radius of the 1st circle is %.2f\n",n1.getRadius());
        System.out.printf("The area and circumference of the circle are %.2f and %.2f respectively\n",n1.getArea(), n1.getCircumference());

        System.out.printf("\nThe radius of the 2nd circle is %.2f\n",n2.getRadius());
        System.out.printf("The area and circumference of the circle are %.2f and %.2f respectively\n",n2.getArea(), n2.getCircumference());
        
        n1.setRadius(12.61);
        n2.setRadius(16.33);
        System.out.println("After updating the both the radius we get : ");
        System.out.printf("\nThe radius of the 1st circle is %.2f\n",n1.getRadius());
        System.out.printf("The area and circumference of the circle are %.2f and %.2f respectively\n",n1.getArea(), n1.getCircumference());

        System.out.printf("\nThe radius of the 2nd circle is %.2f\n",n2.getRadius());
        System.out.printf("The area and circumference of the circle are %.2f and %.2f respectively\n",n2.getArea(), n2.getCircumference());

    }
}

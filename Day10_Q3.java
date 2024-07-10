// Write a Java program to create a class called 
// "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
class Rectangle{
    double width;
    double height;

    public  double area(){
        return this.width * this.height;
    }
    public double perimeter(){
        return 2*(this.width + this.height);
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void printDetail(){
        System.out.println("The width and height of rectangle are "+this.width+" and "+this.height);
        System.out.println("The area of the rectangle : "+this.area());
        System.out.println("The perimeter of the rectangle is "+this.perimeter());
        System.out.println();
    }
        
    
}
public class Day10_Q3 {
    public static void main(String[] args) {
        Rectangle n1 = new Rectangle(45, 65);
        Rectangle n2 = new Rectangle(52, 63.5);
        n1.printDetail();
        n2.printDetail();
    }
}

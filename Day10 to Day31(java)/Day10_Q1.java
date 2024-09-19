// 1. Write a Java program to create a class called "Person" with a name and age attribute. 
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(String name){
        this.name = name;
    }
    Person(int age){
        this.age = age;
    }
    public void printDetail(){
        System.out.println(this.name+" is "+this.age+" year old");
    }
}
public class Day10_Q1 {
    public static void main(String[] args) {
        Person person1 = new Person("Jack", 21);
        Person person2 = new Person(45);
        person2.name = "Jhon";
        person1.printDetail();
        person2.printDetail();
        
    }
}

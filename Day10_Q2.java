// Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, 
// set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
class Dog{
    String name;
    String breed;
    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public void setter(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public void printDetail(){
        System.out.println("The Dog named "+this.name+" belongs to "+this.breed+" breed");
    }
}
public class Day10_Q2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Poodle");
        
        System.out.println("Initial details:");
        dog1.printDetail();
        dog2.printDetail();
        
        dog1.setter("Charlie", "Labrador");
        dog2.setter("Bella", "Pug");
        
        System.out.println("\nUpdated details:");
        dog1.printDetail();
        dog2.printDetail();
    }
}

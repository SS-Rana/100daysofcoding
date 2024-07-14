package Traffic;

public class Main {
	public static void main(String[] args) {
		TrafficLight signal = new TrafficLight("Red", 30);
		
		System.out.println("The color is Red : "+signal.isRed());
		System.out.println("The color is Green: "+signal.isGreen());
		System.out.println("The duration of the signal is "+signal.getDuration());
	 	
		System.out.println();
		System.out.println("Changing the color of the signal");
		signal.setColor("Green");
		System.out.println();
		
		System.out.println("The color is Red : "+signal.isRed());
		System.out.println("The color is Green: "+signal.isGreen());
		System.out.println("The duration of the signal is "+signal.getDuration());
			
	}
}

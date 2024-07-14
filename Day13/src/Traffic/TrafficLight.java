package Traffic;
//Write a Java program to create class called "TrafficLight" with 
//attributes for color and duration, and methods to change the color and check for red or green. 
public class TrafficLight {
	private String color;
	private int duration;
	
	TrafficLight(String color, int duration){
		this.color = color;
		this.duration = duration;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDuration() {
		return duration;
	}
	public void setColor(int duration) {
		this.duration = duration;
	}
	public boolean isRed() {
		return color.equals("Red");
	}
	public boolean isGreen() {
		return color.equals("Green");
	}
}

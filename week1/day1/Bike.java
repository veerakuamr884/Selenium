package week1.day1;

public class Bike {
	public void startEngine() {
		System.out.println("Engine Started");
		
	}
	public void turnonWiper() {
		System.out.println("Wiper is On");
		
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.startEngine();
		b.turnonWiper();
		
	}
}

package week1.day1;

public class Mobile {
	
	private void makeCall() {
		String mobileModel="M4pro";
		float mobileWeight=4.65f;
		
		System.out.println("make call");
		
	}
	private void sendSms() {
		boolean fullycharged=true;
		int mobilecost=21000;
		
		System.out.println("send sms");
		
	}
	public static void main(String[] args) {
		Mobile mobile=new Mobile ();
		mobile.makeCall();
		mobile.sendSms();
		
		System.out.println("This is my Mobile");

		
		
	}

}

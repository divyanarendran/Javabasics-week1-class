package javabasics;

public class Mobile {
	int androidVersion = 9;
	String model = "Iphone X ";
	double mobilePrice = 9999.9;
	boolean iphone = true;
	

	public void makeCall() {
		System.out.println("Making a call");
	}

	public void sendMessage() {
		System.out.println("Sending a message");
	}

	public void accessCamera() {
		System.out.println("Accessing camera");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile call = new Mobile();
		call.makeCall();
		call.sendMessage();
		call.accessCamera();
		
		
		int androidVersion2 = call.androidVersion;
		System.out.println("The android version is "+androidVersion2);
		
		String model2 = call.model;
		System.out.println("The model is " +model2);
		
		double mobilePrice2 = call.mobilePrice;
		System.out.println("The mobile price is " +mobilePrice2);
		
		boolean iphone2 = call.iphone;
		System.out.println("The model is "+iphone2);
		//boolean iphone2 = call.iphone;



	}

}

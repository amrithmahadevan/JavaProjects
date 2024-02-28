package atmpin;

public class Bank {
	private int pin;
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	public void getPin() {
		if(pin==1001||pin==1234||pin==1212) {
			System.out.println("valid pin entered.");
		}
		else {
			System.out.println("Invalid pin");
		}
	}
	
}

package Question7;

public class UsedCarException extends Exception {
	
	public UsedCarException(String VIN) {
		super(VIN);
	}
}

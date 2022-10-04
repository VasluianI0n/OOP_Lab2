package Objects;

public class VendingMachine {
	private String status;
	
	public VendingMachine() {
		status = "free";
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String st) {
		status = st;
	}
}

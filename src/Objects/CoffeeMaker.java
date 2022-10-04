package Objects;

public class CoffeeMaker {
private String status;
	
	public CoffeeMaker() {
		status = "free";
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String st) {
		status = st;
	}
}

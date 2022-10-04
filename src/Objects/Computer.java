package Objects;

public class Computer {
	private String status;
		
		public Computer() {
			status = "free";
		}
		
		public String getStatus() {
			return status;
		}
		
		public void setStatus(String st) {
			status = st;
		}
}

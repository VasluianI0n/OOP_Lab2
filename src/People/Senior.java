package People;

import utilities.Nicknames;

public class Senior {
	private Nicknames nickname =  new Nicknames();
	private String shift;
	private String status;
		
		public Senior() {
			status = "watching over the workers:";
		}
		
		public void setShift(int n) {
			if(n == 0) {
				shift = "morning";
			}else if(n == 1) {
				shift = "afternoon";
			}else if(n == 2) {
				shift = "evening";
			}
		}
		
		public String getShift() {
			return shift;
		}
		
		public String getNickname() {
			return nickname.getName();
		}
		
		public String getStatus() {
			return status;
		}
}

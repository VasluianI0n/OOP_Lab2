package People;

import utilities.Nicknames;

public class WatchMan {
	private Nicknames nickname =  new Nicknames();
	private String day;
	private String status;
		
		public WatchMan() {
			status = "Guarding the doors.";
		}
		
		public void setDay(String day) {
			this.day = day;
		}
		
		public String getDay() {
			return day;
		}
		
		public String getNickname() {
			return nickname.getName();
		}
		
		public String getStatus() {
			return status;
		}
}

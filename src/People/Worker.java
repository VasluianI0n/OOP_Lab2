package People;
import utilities.Nicknames;

import java.util.concurrent.ThreadLocalRandom;

import utilities.Days;

public class Worker {
	private String status;
	private String shift;
	private Days workingDays;
	private int workingStartHour, workingStartMinutes, workingEndHour, workingEndMinutes;
	private Nicknames nick;
	
		public Worker() {
			status = "going to work";
			nick = new Nicknames();
			workingDays = new Days();
		}
		
		public String getStatus() {
			return status;
		}
		
		public void setNickname() {
			nick.setName();
		}
		
		public String getNickname() {
			return nick.getName();
		}
		
		public void setShift(int s) {
			if(s == 1) {
				shift = "morning";
				workingStartHour = 9;
				workingStartMinutes = 0;
				workingEndHour = 17;
				workingEndMinutes = 0;
			}else if(s == 2) {
				shift = "evening";
				workingStartHour = 23;
				workingStartMinutes = 0;
				workingEndHour = 7;
				workingEndMinutes = 0;
			}else if(s == 3) {
				shift = "afternoon";
				workingStartHour = 12;
				workingStartMinutes = 0;
				workingEndHour = 20;
				workingEndMinutes = 0;
			}
		}
		
			public int getStartHour() {
				return workingStartHour;
			}
			
			public int getEndHour() {
				return workingEndHour;
			}
			
			public String getShift() {
				return shift;
			}
			
			
			public boolean isWorkingDay(String day) {
				for(int i = 0; i < 5; i++) {
					if(day == workingDays.getWorkingDays()[i]) {
						return true;
					}
			}
			
				return false;
			}
			
			
			public void printWorkingDays() {
				for(int i = 0; i < 5; i++) {
					System.out.println("\t"+workingDays.getWorkingDays()[i]);
				}
			}
			public boolean checkDay(String day) {
				for(int i = 0; i < 5; i++) {
					if(day.equals(workingDays.getWorkingDays()[i])) {
						return true;
					}
				}
				return false;
			}
			
			public boolean checkHour(String hour) {
				String h2 = hour.substring(0,2);
				int h = Integer.parseInt(h2);
				if(getShift()=="evening") {
					if(h < getEndHour() || h > getStartHour()) {
						return true;
					}else {
						return false;
					}
				}else {
				if(h < getEndHour() && h > getStartHour()) {
					return true;
				}else {
					return false;
				}
				}
			}
			
			public void checkWorkingHour(String day, String hour) {
				if(checkDay(day) == true) {
					if(checkHour(hour)==true) {
						int choice = ThreadLocalRandom.current().nextInt(0, 10);
						if(choice == 4) {
							choice  = ThreadLocalRandom.current().nextInt(0, 6);
							String wher;
							if(choice == 0) {
								wher = "outside.";
							}else if(choice == 1) {
								wher = "inside at the working place.";
							}else if(choice == 2) {
								wher = "eating in the kitchen.";
							}else if(choice == 3) {
								wher = "making a coffee in the kitchen.";
							}else if(choice == 4){
								wher = "in the toilet.";
							}else {
								wher = "in the recreation room.";
							}
							status = "On a break " + wher;
						}else {
							status = "Working at the working place.";
						}
				}else {
					status = "Out of working hours.";
				}
				}else {
					status = "on a Free Day.";
				}
			}
}


package calendarinvitesentstate;

public class AppointmentState implements State {
	
MicrosoftCalendar microsoftCalendar;
	
	public AppointmentState(MicrosoftCalendar microsoftCalendar) {
		this.microsoftCalendar = microsoftCalendar;
	}

	public void addEvent() {
		System.out.println("Please Wait we are already adding you an Calendar");
	}
	
	public void cancelEvent() {
		System.out.println("Sorry, You already clicked the plus");
	}
	
	public void clickPlus() {
		System.out.println("Clicking Twice doesn't add you another appointment!");
	}
	
	public void send() {
		microsoftCalendar.releaseDate();
		if(microsoftCalendar.getCount() > 0 ) {
			microsoftCalendar.setState(microsoftCalendar.getNoEventState());
		} else {
			System.out.println("Oops, out of Calendar!");
			microsoftCalendar.setState(microsoftCalendar.getCancelAppointmentState());
		}
	}
	
	public void reschedule() {
		
	}


	public String toString() {
		return "Sending Calendar";
	}
	
	

}

package calendarinvitesentstate;

import java.util.Random;

//import java.util.Random;

public class HasEventState implements State {
	Random randomInviteSent = new Random(System.currentTimeMillis());
MicrosoftCalendar microsoftCalendar;
	
	public HasEventState(MicrosoftCalendar microsoftCalendar) {
		this.microsoftCalendar = microsoftCalendar;
	}

	public void addEvent() {
		System.out.println("You can't add multiple Events");
	}
	
	public void cancelEvent() {
		System.out.println("Event Removed");
		microsoftCalendar.setState(microsoftCalendar.getNoEventState());
	}
	
	public void clickPlus() {
		System.out.println("You moved...");
		int inviteSent = randomInviteSent.nextInt(12);
		if ((inviteSent == 1) && (microsoftCalendar.getCount() > 2)) {
		microsoftCalendar.setState(microsoftCalendar.getAppointmentState());
	} else {
		microsoftCalendar.setState(microsoftCalendar.getAppointmentState());
		}
	}
	
	public void send() {
		System.out.println("No Event deleted");
	}
	
	public void reschedule() {}
	
	public String toString() {
		return "waiting for click of Plus";
	}
	

}

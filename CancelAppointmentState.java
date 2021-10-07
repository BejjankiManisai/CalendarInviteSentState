package calendarinvitesentstate;

public class CancelAppointmentState implements State {
MicrosoftCalendar microsoftCalendar;
	
	public CancelAppointmentState(MicrosoftCalendar microsoftCalendar) {
		this.microsoftCalendar = microsoftCalendar;
	}
	
	public void addEvent() {
		System.out.println("You can't add an event, the Calendar is updated");
	}
	
	public void cancelEvent() {
		System.out.println("You can't Cancel, you haven't added an event yet");
	}
	
	public void clickPlus() {
		System.out.println("You removed, but there are no appointments");
	}
	
	public void send() {
		System.out.println("No event sent");
	}
	
	public void reschedule() {
		microsoftCalendar.setState(microsoftCalendar.getNoEventState());
	}
	
	public String toString() {
		return "appointment added";
	}



}

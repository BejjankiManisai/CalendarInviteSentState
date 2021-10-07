package calendarinvitesentstate;

public class NoEventState implements State {
	
MicrosoftCalendar microsoftCalendar;
	
	public NoEventState(MicrosoftCalendar microsoftCalendar) {
		this.microsoftCalendar = microsoftCalendar;
	}


	public void addEvent() {
		System.out.println("You added an Event");
		microsoftCalendar.setState(microsoftCalendar.getHasEventState());
	}
		
	public void clickPlus() {
		System.out.println("You Clicked, but there is no event");
	}
	
	public void send() {
		System.out.println("You need to create first");
	}
	
	public void reschedule() {}


	public void cancelEvent() {
		System.out.println("You didn't add an event");
		
	}
	
	public String toString() {
		return "waiting for event";
	}


}

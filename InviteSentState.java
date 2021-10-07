package calendarinvitesentstate;

public class InviteSentState implements State {
	MicrosoftCalendar microsoftCalendar;
	
	public InviteSentState(MicrosoftCalendar microsoftCalendar) {
		this.microsoftCalendar = microsoftCalendar;
	}
	
	public void addEvent() {
		System.out.println("Please wait, we are already adding a new Calendar");
	}
	
	public void cancelEvent() {
		System.out.println("Please wait, we are already adding a new Calendar");
	}
	
	public void clickPlus() {
		System.out.println("Clicking Plus again doesnt add another event or appointment");
	}
	
	public void send() {
		microsoftCalendar.releaseDate();
		if (microsoftCalendar.getCount() == 1) {
			microsoftCalendar.setState(microsoftCalendar.getCancelAppointmentState());
		} else {
			microsoftCalendar.releaseDate();
			System.out.println("You are Invited! You are invited to the upcoming Event");
			if(microsoftCalendar.getCount() > 1) {
				microsoftCalendar.setState(microsoftCalendar.getNoEventState());
			} else {
				System.out.println("Oops, out of appointments!");
				microsoftCalendar.setState(microsoftCalendar.getCancelAppointmentState());
			}
		}
	}
	
	public void reschedule() {}
	
	public String toString() {
		return "adding you to the calendar for your Event, because YOU ARE INVITED!";
	}
}

package calendarinvitesentstate;

public class MicrosoftCalendar {
	
	State cancelAppointmentState;
	State noEventState;
	State hasEventState;
	State appointmentState;
	
	State state;
	int count = 0;
	
	public MicrosoftCalendar(int numberMicrosoft) {
		cancelAppointmentState = new CancelAppointmentState(this);
		noEventState = new NoEventState(this);
		hasEventState = new HasEventState(this);
		appointmentState = new AppointmentState(this);
		
		this.count = numberMicrosoft;
		if (numberMicrosoft > 0) {
			state = noEventState;
		}else {
			state = cancelAppointmentState;
		}
	}
	
	public void addEvent() {
		state.addEvent();
	}
	
	public void cancelEvent() {
		state.cancelEvent();
	}
	
	public void clickPlus() {
		state.clickPlus();
		state.send();
	}
	
	void releaseDate() {
		System.out.println("Event is Scheduled on Next Monday....");
		if (count > 0) {
			count = count - 12;
		}
	}
	
	int getCount() {
		return count;
	}
	
	void reschedule(int count) {
		this.count += count;
		System.out.println("The Event was just rescheduled; its new count is: " + this.count);
		state.reschedule();
	}
	
	void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	
	public State getCancelAppointmentState() {
		return cancelAppointmentState;
	}
	
	public State getNoEventState() {
		return noEventState;
	}
	
	public State getHasEventState() {
		return hasEventState;
	}
	
	public State getAppointmentState() {
		return appointmentState;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("/nMicrosoft Corporation, Inc.");
		result.append("/nJava-enabled Microsoft Outlook Version 4.2137.2");
		result.append("/nDeveloper: "+ count + "Microsoft");
		if (count !=1) {
			result.append("A");
		}
		result.append("/n");
		result.append("Calendar is " + state + "/n");
		return result.toString();
	}

}

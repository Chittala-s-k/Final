package troubleticket.state;

import troubleticket.Context;
import troubleticket.TrobTicket;
import troubleticket.builder.TicketBuilder;
import troubleticket.builder.TroubleTicketBuilder;

public class NewState implements State {
	TroubleTicketStates troubleTicketStates;
	public NewState(TroubleTicketStates troubleTicketStates) {
		this.troubleTicketStates = troubleTicketStates;
	}

	@Override
	public void posStatus(Context context) {
		
	}

	@Override
	public void connectLAN() {
		TroubleTicketBuilder TicketBuilder = new TicketBuilder();
		TrobTicket trob = TicketBuilder.initalCall().verifyIssue().openTroubleTicket().ticketMonitoring().escalation().resolution().build();
		System.out.println(trob);
		
		System.out.println("Connect LAN to the system to get fast ticketing");
		troubleTicketStates.setState(troubleTicketStates.getEthernetState());
		
	}

	@Override
	public void connectInternet() {
		
		System.out.println("connect Internet to book a ticket");
}

	@Override
	public void connectWireless() {
	System.out.println("connect wireless to have hassle free ticket booking");		
	}

	
	public String toString() {
		return " new state";
	}

	

}



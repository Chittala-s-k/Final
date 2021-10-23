package troubleticket.state;

import troubleticket.Context;

public class InternetState implements State{

	TroubleTicketStates troubleTicketStates;
	public InternetState(TroubleTicketStates troubleTicketStates) {
		this.troubleTicketStates = troubleTicketStates;
	}
	
	@Override
	public void connectLAN() {
		System.out.println("Connect LAN to the system to get fast ticketing");

	}

	@Override
	public void connectInternet() {
		System.out.println("connect Internet to book a ticket");


	}

	@Override
	public void connectWireless() {
		System.out.println("connect wireless to have hassle free ticket booking");	
		troubleTicketStates.setState(troubleTicketStates.getwirelessNetworkState());


	}

	

	
	public String toString() {
		return " Internet state";
	}


	@Override
	public void posStatus(troubleticket.Context context) {
		// TODO Auto-generated method stub
		
	}


	
}











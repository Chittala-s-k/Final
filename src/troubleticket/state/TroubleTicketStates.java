package troubleticket.state;

public class TroubleTicketStates {
	State newState;
	State ethernetState;
	State internetState;
	State wirelessNetworkState;
	
	State state;

	public TroubleTicketStates() {
		newState= new NewState(this);
		ethernetState = new EthernetState(this);
		internetState = new InternetState(this);
		wirelessNetworkState = new WirelessNetworkState(this);
		state = newState ;
	}
	
	public void connectLAN() {
		state.connectLAN();
	}
	public void connectInternet() {
		state.connectInternet();
	}
	public void connectWireless() {
		state.connectWireless();
	}
	
	
	
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public State getNewState() {
		return newState;
	}
	public State getEthernetState() {
		return ethernetState;
	}
	public State getInternetState() {
		return internetState;
	}
	public State getwirelessNetworkState() {
		return wirelessNetworkState;
	}
	

	
	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("---- Ticketing Process ------");

		result.append("\nTicket is in " + state + "\n");

		return result.toString();
	}

}









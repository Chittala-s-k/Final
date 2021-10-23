package troubleticket.state;

import troubleticket.Context;

public interface State {
	public void posStatus(Context context);

	void connectLAN();

	void connectInternet();

	void connectWireless();


}

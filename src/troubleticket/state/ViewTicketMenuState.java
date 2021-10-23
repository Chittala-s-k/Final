package troubleticket.state;

import troubleticket.Context;
import troubleticket.factory.MenuFactory;

public class ViewTicketMenuState implements State{

	@Override
	public void posStatus(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.chooseMenu();
	}

	@Override
	public void connectLAN() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connectInternet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connectWireless() {
		// TODO Auto-generated method stub
		
	}		
}



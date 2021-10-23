package troubleticket.state;

import java.util.Scanner;

import troubleticket.Context;

public class MainMenuStatus implements State{
	@Override
	public void posStatus(Context context) {
		// TODO Auto-generated method stub
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("--------Ticketing System-----\n" + 
		"1) Ticket Selections \n" + 
		"2) Log Out\n");
		
		System.out.print("");

		int TicketInpt = usrInpt.nextInt();
		
		if(TicketInpt ==1) {
			ViewTicketMenuState viewTickets = new ViewTicketMenuState();
			viewTickets.posStatus(context);
		}
		
		
		else {
			System.exit(0);
		}
	context.setState(this);
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

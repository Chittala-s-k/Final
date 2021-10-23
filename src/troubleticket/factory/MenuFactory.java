package troubleticket.factory;

import java.util.Scanner;

import troubleticket.Context;
import troubleticket.iterator.PrintProductMenu;
import troubleticket.iterator.ProductMenu;
import troubleticket.state.MainMenuStatus;
import troubleticket.state.TroubleTicketStates;

public class MenuFactory {
	public void chooseMenu() {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) Ticketing system Menu\n"+
		"2) Ticketing Process\n"+
		"3) Home Screen" );
		
		
		int menuChoice = usrInpt.nextInt();
		
		
		if(menuChoice ==1) {
			ProductMenu productmenu = new ProductMenu();
			PrintProductMenu prntpmnu = new PrintProductMenu(productmenu);
			
			prntpmnu.printMenu();
		}
		if(menuChoice ==2) {
			
			TroubleTicketStates states = new TroubleTicketStates();

			System.out.println(states);
			states.connectLAN();
			System.out.println(states);
			states.connectInternet();
			System.out.println(states);
			states.connectWireless();
			System.out.println(states);

				
		}
			
			
		
		else {
			Context context = new Context();
			MainMenuStatus goHome = new MainMenuStatus();
			goHome.posStatus(context);
		}
		
		
		
		
		Context context = new Context();
		
		
	}
}







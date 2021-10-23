package troubleticket.iterator;

import troubleticket.ConnectWise;
import troubleticket.HubSpot;
import troubleticket.Jitbit;
import troubleticket.SpiceWorks;
import troubleticket.TicketingSystems;

public class ProductMenu {
	int numberOfItems = 0;
	TicketingSystems[] productMenu;
	
	public ProductMenu() {
		
		productMenu = new TicketingSystems[6];
		
		productMenu[0] = new SpiceWorks();
		productMenu[1] = new HubSpot();
		productMenu[2] = new ConnectWise();
		productMenu[3] = new Jitbit();
	}
	
	public Iterator createIterator() {
		return new ProductMenuIterator(productMenu);
	}

}




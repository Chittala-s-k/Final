package troubleticket.iterator;

import troubleticket.TicketingSystems;
import troubleticket.facade.PrintMenus;

public class PrintProductMenu implements PrintMenus {

	ProductMenu productMenu;
	TicketingSystems ticketingSystems;
	
	public PrintProductMenu(ProductMenu productMenu) {
		this.productMenu = productMenu;
	}
	
	public void printMenu() {
		Iterator iterateProductMenu = productMenu.createIterator();
		printMenu(iterateProductMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-------------------Ticketing System MENU-------------------\n\n");
		
		 
		while(iterator.hasNext()){
			TicketingSystems  ticketingSystems= (TicketingSystems) iterator.next();
			  
			  System.out.print(ticketingSystems.getTicketName() + "\t");
			  System.out.print(" $"+ticketingSystems.getMinCost()+"\n");

			  System.out.println(ticketingSystems.getDescription()+"\t");
			
		}
		 
	}
}







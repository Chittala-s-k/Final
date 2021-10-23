package troubleticket.iterator;

import troubleticket.TicketingSystems;

public class ProductMenuIterator implements Iterator {

	TicketingSystems[] productMenu;
	int position;
	
	public ProductMenuIterator(TicketingSystems[] productMenu) {
		this.productMenu = productMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > productMenu.length || productMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public TicketingSystems next() {
		
		TicketingSystems productMenuPos = (TicketingSystems) productMenu[position];
		position = position +1;
		
		return productMenuPos;
	}

}

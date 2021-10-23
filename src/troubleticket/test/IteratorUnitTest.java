package troubleticket.test;

import troubleticket.*;
import troubleticket.iterator.Iterator;
import troubleticket.iterator.ProductMenu;

public class IteratorUnitTest {
	public static void main(String[] args) {
		ProductMenu productMenu = new ProductMenu();
		Iterator iterator = productMenu.createIterator();
		if(iterator.hasNext()) {
			System.out.println("Valid Test has next Item");
		}
		else {
			System.err.println("Invalid Call to iterator hasNext");
		}
	}

}

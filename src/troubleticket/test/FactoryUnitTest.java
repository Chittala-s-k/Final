package troubleticket.test;

import troubleticket.*;
import troubleticket.factory.MenuFactory;

public class FactoryUnitTest {
	public static void main(String[] args) {
		Context context = new Context();
		MenuFactory testFactory = new MenuFactory();
		testFactory.chooseMenu();

	}

}

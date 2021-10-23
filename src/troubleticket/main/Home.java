package troubleticket.main;

import troubleticket.Context;
import troubleticket.state.MainMenuStatus;

public class Home {
	 public static void main(String[] args) {
			Context context = new Context();
			
			MainMenuStatus startUp = new MainMenuStatus();
			startUp.posStatus(context);
		
		}

}

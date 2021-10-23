package troubleticket.builder;

import java.util.ArrayList;
import java.util.List;

import troubleticket.TrobTicket;

public abstract class TroubleTicketBuilder {
	protected String name;
	protected List<String> steps = new ArrayList<String>();
	public abstract TroubleTicketBuilder initalCall();
	public abstract TroubleTicketBuilder verifyIssue();
	public abstract TroubleTicketBuilder openTroubleTicket();
	public abstract TroubleTicketBuilder ticketMonitoring();
	public abstract TroubleTicketBuilder escalation();
	public abstract TroubleTicketBuilder resolution();


	public TrobTicket build() {
		TrobTicket  trobTicket = new TrobTicket();
		trobTicket.setName(this.name);
		trobTicket.addSteps(steps);
		return trobTicket;
	}

}





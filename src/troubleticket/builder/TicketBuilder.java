package troubleticket.builder;

public class TicketBuilder extends TroubleTicketBuilder {
	public TicketBuilder() {
		this.name = "follow these steps to troubleshoot  ticket";
	}

	@Override
	public TroubleTicketBuilder initalCall() {
		this.steps.add("1) record all service issues in detail");		
		return this;
	}

	@Override
	public TroubleTicketBuilder verifyIssue() {
		this.steps.add("2) make a test call on the service in question, send an email or access the Web")	;	
		return this;
	}

	@Override
	public TroubleTicketBuilder openTroubleTicket() {
		this.steps.add("3) call the service provider and open a trouble ticket with them.")	;	
		return this;
	}

	@Override
	public TroubleTicketBuilder ticketMonitoring() {
		this.steps.add("4) determine which monitoring activity to address first, based on the following categories: email, voice mail, VOIP, Internet access, MPLS and voice service.")	;	
		return this;
	}

	@Override
	public TroubleTicketBuilder escalation() {
		this.steps.add("5) escalate the issue with channel managers, local engineers.")	;	
		return this;
	}

	@Override
	public TroubleTicketBuilder resolution() {
		this.steps.add("6) verify the ‘fix’ and close the ticket with the service provider.")	;	
		return this;
	}

	

}

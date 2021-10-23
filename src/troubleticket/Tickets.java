package troubleticket;

public abstract class Tickets {
	String TicketName;
	double minCost;
	public String getTicketName() {
		return TicketName;
	}
	public void setTicketName(String ticketName) {
		TicketName = ticketName;
	}
	public double getMinCost() {
		return minCost;
	}
	public void setMinCost(double mincost) {
		this.minCost = mincost;
	}
	
}

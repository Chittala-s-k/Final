package troubleticket;

import java.util.List;

public class TrobTicket {
	String name;
	List<String> steps ;
	public void addSteps(List<String> steps) {
		this.steps = steps;
	}

	void install() {
		System.out.println("Process " + name );
		System.out.println("follow steps");
		for(String step : steps) {
			System.out.println("   " + step);
		}

	}
	
	public void setName(String name ) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("----" + this.name + "-----");
		for(String step: steps) {
			display.append(step + "\n");
		}
		return display.toString();
	}
}





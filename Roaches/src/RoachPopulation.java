
public class RoachPopulation {

	private double population;
	

	


	public RoachPopulation(double population) {
		// TODO Auto-generated constructor stub
	}

	public void breed(double newpopulation) {
		
		newpopulation = population * 2;
	}
	
	public void spray (double spraypct) {
		
		population = population * spraypct;
		
	}
	
	public double getRoaches() {
		
		return population;
	}
	
	public static void main(String[] args) {
		

	}

}

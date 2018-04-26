
public class Doughnut {
	private String flavor;
	private int weight;
	private boolean filled;	
	
	public Doughnut() { // Default Constructer
		flavor = "glazed";
		weight = 26;
		filled = true;		
	}
	public Doughnut(String fla, int w, boolean f) {// Other construction 
		flavor = fla;
		weight = w;
		filled = f;
	}
	public void eatDoughnut() {
		System.out.println("YUMMY!");
	}

	public String getFlavor() {
		return flavor;		
	}
	public int getWeight() {
		return weight;
	}
	public boolean getFilled() {
		return filled;
	}
	
}

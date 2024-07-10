
public abstract class plant {
	
	//attributes
	
	private String name;
	private double height;
	private boolean hasLeaves;
	private String clima;
	
	//Empty Constructor
	public plant() {
		super();
	}

	// Constructor
	public plant(String name, double height, boolean hasLeaves, String clima) {
		super();
		this.name = name;
		this.height = height;
		this.hasLeaves = hasLeaves;
		this.clima = clima;
	}
	
	//getter and Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isHasLeaves() {
		return hasLeaves;
	}

	public void setHasLeaves(boolean hasLeaves) {
		this.hasLeaves = hasLeaves;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}
	
	
	
	public abstract void whatIam(); 
	
	
	

	
	
	

}


public class Tree extends plant {
	private String variety;
	private String typeLog;
	private double radioLog;
	private String color;
	private String typeLeaves;
	
	public Tree() {
		super();
	}

	

	public Tree(String name, double height, boolean hasLeaves, String clima, String variety, String typeLog,
			double radioLog, String color, String typeLeaves) {
		super(name, height, hasLeaves, clima);
		
		this.variety = variety;
		this.typeLog = typeLog;
		this.radioLog = radioLog;
		this.color = color;
		this.typeLeaves = typeLeaves;
	}



	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getTypeLog() {
		return typeLog;
	}

	public void setTypeLog(String typeLog) {
		this.typeLog = typeLog;
	}

	public double getRadioLog() {
		return radioLog;
	}

	public void setRadioLog(double radioLog) {
		this.radioLog = radioLog;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTypeLeaves() {
		return typeLeaves;
	}

	public void setTypeLeaves(String typeLeaves) {
		this.typeLeaves = typeLeaves;
	}

	//point 3
	@Override
	public void whatIam() {
		
		System.out.println("I am a tree ");
		
	}

	
	

}

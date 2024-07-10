
public class Bush  extends plant{

	private double weight ;
	private boolean isDomestic;
	private String variedad;
	private String colorLeaves;
	private boolean cut;
	
	
	public Bush() {
		super();
	}



	public Bush(String name, double height, boolean hasLeaves, String clima, double weight, boolean isDomestic,
			String variedad, String colorLeaves, boolean cut) {
		super(name, height, hasLeaves, clima);
		this.weight = weight;
		this.isDomestic = isDomestic;
		this.variedad = variedad;
		this.colorLeaves = colorLeaves;
		this.cut = cut;
	}





	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public boolean isDomestic() {
		return isDomestic;
	}



	public void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}



	public String getVariedad() {
		return variedad;
	}



	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}



	public String getColorLeaves() {
		return colorLeaves;
	}



	public void setColorLeaves(String colorLeaves) {
		this.colorLeaves = colorLeaves;
	}



	public boolean isCut() {
		return cut;
	}



	public void setCut(boolean cut) {
		this.cut = cut;
	}



	//point 3
	@Override
	public void whatIam() {
		
		System.out.println("I am a bush ");
		
	}

}

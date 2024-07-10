
public class Flower extends plant{

	private int QuantityPedals;
	private String coloPistilo;
	private String variedad;
	private String station;
	
	public Flower() {
		super();
	}



	public Flower(String name, double height, boolean hasLeaves, String clima, int quantityPedals, String coloPistilo,
			String variedad, String station) {
		super(name, height, hasLeaves, clima);
		QuantityPedals = quantityPedals;
		this.coloPistilo = coloPistilo;
		this.variedad = variedad;
		this.station = station;
	}



	public int getQuantityPedals() {
		return QuantityPedals;
	}



	public void setQuantityPedals(int quantityPedals) {
		QuantityPedals = quantityPedals;
	}



	public String getColoPistilo() {
		return coloPistilo;
	}



	public void setColoPistilo(String coloPistilo) {
		this.coloPistilo = coloPistilo;
	}



	public String getVariedad() {
		return variedad;
	}



	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}



	public String getStation() {
		return station;
	}



	public void setStation(String station) {
		this.station = station;
	}

//point 3
	

	@Override
	public void whatIam() {
		
		System.out.println("I am a flower ");
		
	}

}

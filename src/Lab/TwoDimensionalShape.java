package Lab;

public class TwoDimensionalShape extends Shape {
	protected Double cevre;

	protected TwoDimensionalShape(String adi, Double alan, Double cevre) {
		super(adi, alan);
		this.cevre = cevre;
	}

	protected Double getCevre() {
		return cevre;
	}

	protected void setCevre(Double cevre) {
		this.cevre = cevre;
	}

	
	

}

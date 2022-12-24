package Lab;

public class Triangle extends TwoDimensionalShape {
	protected Double kenar;

	protected Triangle(String adi, Double alan, Double cevre, Double kenar) {
		super(adi, alan, cevre);
		this.kenar = kenar;
	}

	protected Double getKenar() {
		return kenar;
	}

	protected void setKenar(Double kenar) {
		this.kenar = kenar;
	}

	
	
	

}

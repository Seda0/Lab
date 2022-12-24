package Lab;

public class Square extends TwoDimensionalShape{
	protected Double kenar;

	protected Square(String adi, Double alan, Double cevre, Double kenar) {
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

package Lab;

public class Circle extends TwoDimensionalShape  {

	protected Double  yariCap;

	protected Circle(String adi, Double alan, Double cevre, Double yariCap) {
		super(adi, alan, cevre);
		this.yariCap = yariCap;
	}

	protected Double getYariCap() {
		return yariCap;
	}

	protected void setYariCap(Double yariCap) {
		this.yariCap = yariCap;
	}


	
	


	
}

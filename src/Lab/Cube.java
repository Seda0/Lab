package Lab;

public class Cube extends ThreeDimensionalShape {
	protected Double yariCap;

	protected Cube(String adi, Double alan, Double hacim, Double yariCap) {
		super(adi, alan, hacim);
		this.yariCap = yariCap;
	}

	protected Double getYariCap() {
		return yariCap;
	}

	protected void setYariCap(Double yariCap) {
		this.yariCap = yariCap;
	}

	

}

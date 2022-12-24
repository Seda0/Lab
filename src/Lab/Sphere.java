package Lab;

public class Sphere extends ThreeDimensionalShape {
	protected Double yariCap;

	protected Sphere(String adi, Double alan, Double hacim, Double yariCap) {
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

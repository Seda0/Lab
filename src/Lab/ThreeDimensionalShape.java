package Lab;

public class ThreeDimensionalShape extends Shape {
	protected Double hacim;

	protected ThreeDimensionalShape(String adi, Double alan, Double hacim) {
		super(adi, alan);
		this.hacim = hacim;
	}

	protected Double getHacim() {
		return hacim;
	}

	protected void setHacim(Double hacim) {
		this.hacim = hacim;
	}



}

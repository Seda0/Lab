package Lab;

public class Tetrahedrom extends ThreeDimensionalShape{
	protected Double kenar;

	protected Tetrahedrom(String adi, Double alan, Double hacim, Double kenar) {
		super(adi, alan, hacim);
		this.kenar = kenar;
	}

	protected Double getKenar() {
		return kenar;
	}

	protected void setKenar(Double kenar) {
		this.kenar = kenar;
	}

	

}

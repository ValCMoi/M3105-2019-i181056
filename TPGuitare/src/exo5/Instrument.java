package exo5;

public abstract class Instrument {

	private String serialNumber = "NA";
	private double price = 0;
	private InstrumentSpec spec;

	public Instrument(String serialNumber, double price, InstrumentSpec spec) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public String getSeriealNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public InstrumentSpec getSpec() {
		return spec;
	}

}

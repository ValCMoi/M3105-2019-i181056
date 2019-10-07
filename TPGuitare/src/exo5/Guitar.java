package exo5;

public class Guitar extends Instrument {

	GuitarSpec spec;
/*
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, int numCorde,
			Wood backWood, Wood topWood) {
		super(serialNumber, price);
		spec = new GuitarSpec(builder, model, type, numCorde, backWood, topWood);
	}
*/
	
	
	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		super(serialNumber, price,spec);
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}

package exo4;

public class Guitar  {

	String seriealNumber = null;
	double price =0;
	GuitarSpec spec;

	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type,int numCorde, Wood backWood,
			Wood topWood) {
		super();
		this.seriealNumber = serialNumber;
		this.price = price;
		spec =new GuitarSpec(builder, model, type,numCorde, backWood, topWood);
	}
	
	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		super();
		this.seriealNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	

	/*
	public Guitar(Builder b, String model, Type t, Wood wBack, Wood wTop) {
		super( b,  model,  t,  wBack,  wTop);
		
	}*/
	
	public String getSeriealNumber() {
		return seriealNumber;
	}
	
	public double getPrice() {
		return price;
	}

	public GuitarSpec getSpec() {
		return spec;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}

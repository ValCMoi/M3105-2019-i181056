package exo3;

public class Guitar {

	String seriealNumber;
	Builder builder;
	String model;
	Type type;
	Wood backWood;
	public String getSeriealNumber() {
		return seriealNumber;
	}

	Wood topWood;
	double price;
	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {

		this.seriealNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood =topWood ;
		this.price = price;
		
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	
	
	
}

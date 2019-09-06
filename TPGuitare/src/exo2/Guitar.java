package exo2;

public class Guitar {

	String seriealNumber;
	String builder;
	String model;
	String type;
	String backWood;
	String topWood;
	double price;
	
	public Guitar(String nms, double pr, String build, String model, String type, String backwood,
			String topwood) {

		this.seriealNumber = nms;
		this.builder = build;
		this.model = model;
		this.type = type;
		this.backWood = backwood;
		this.topWood =topwood ;
		this.price = pr;
		
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSeriealNumber() {
		return seriealNumber;
	}

	public String getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

	public String getBackWood() {
		return backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	
	
	
}

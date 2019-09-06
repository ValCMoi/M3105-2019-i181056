package exo1;

import exo2.Builder;
import exo2.Type;
import exo2.Wood;

public class Guitar {

	String seriealNumber;
	Builder builder;
	String model;
	Type type;
	Wood backWood;
	Wood topWood;
	double price;
	


	public Guitar(String nms, double price2, Builder fender, String model2, Type electric, Wood alder, Wood alder2) {
		
		
		this.seriealNumber = nms;
		this.builder = fender;
		this.model = model2;
		this.type = electric;
		this.backWood = alder;
		this.topWood =alder2 ;
		this.price = price2;
		
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

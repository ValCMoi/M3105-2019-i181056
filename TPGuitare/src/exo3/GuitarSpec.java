package exo3;

public class GuitarSpec {

	Builder builder = null;
	String model = null;
	Type type = null;
	Wood backWood = null;
	Wood topWood = null;
	
	public GuitarSpec(Builder b, String model, Type t, Wood wBack, Wood wTop){
		this.builder = b;
		this.model = model;
		this.type = t;
		this.backWood = wBack;
		this.topWood = wTop;
		
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

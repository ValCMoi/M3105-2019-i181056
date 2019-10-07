package exo5;

public abstract class InstrumentSpec {

	private Builder builder = null;
	private String model = null;
	private Type type = null;
	private Wood backWood = null;
	private Wood topWood = null;
	
	
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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

	public boolean matches(InstrumentSpec spec) {
		
		Builder b = spec.getBuilder();
		String model = spec.getModel();
		Wood topWood = spec.getTopWood();
		Wood backWood = spec.getBackWood();
		Type type = spec.getType();

		if ((b != null) && (b != getBuilder())) {
			return false;
		}
		if (model != null && model != getModel()) {
			return false;
		}
		if (topWood != null && topWood != getTopWood()) {
			return false;
		}
		if (backWood != null && topWood != getBackWood()) {
			return false;
		}
		if (type != null && type != getType()) {
			return false;
		}
		return true;
	}
	
}

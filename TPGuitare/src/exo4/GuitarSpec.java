package exo4;

public class GuitarSpec {

	private Builder builder = null;
	private String model = null;
	private Type type = null;
	private Wood backWood = null;
	private Wood topWood = null;
	private int numCorde;

	public GuitarSpec(Builder b, String model, Type t, Wood wBack, Wood wTop) {
		this.builder = b;
		this.model = model;
		this.type = t;
		this.backWood = wBack;
		this.topWood = wTop;

	}

	public GuitarSpec(Builder b, String model, Type t, int numCorde, Wood wBack, Wood wTop) {
		this.builder = b;
		this.model = model;
		this.type = t;
		this.backWood = wBack;
		this.topWood = wTop;
		this.numCorde = numCorde;

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

	public int getNumCorde() {
		return numCorde;
	}

	public boolean matches(GuitarSpec searchGuitar) {

		Builder b = searchGuitar.getBuilder();
		String model = searchGuitar.getModel();
		Wood topWood = searchGuitar.getTopWood();
		Wood backWood = searchGuitar.getBackWood();
		Type type = searchGuitar.getType();
		int numCorde = searchGuitar.getNumCorde();
		
		boolean tabTest[] = new boolean[6];
		boolean res = true;
		for(int i=0;i<6;i++) {
			tabTest[i]=true;
		}
		
		if(b != null) {
			if(b != getBuilder()) {
				tabTest[0] = false;
			}
		}
		if(model != null) {
			if(model != getModel()) {
				tabTest[1] = false;
			}
		}
		if(topWood != null) {
			if(topWood != getTopWood()) {
				tabTest[2] = false;
			}
		}
		if(backWood != null) {
			if(topWood != getBackWood()) {
				tabTest[3] = false;
			}
		}
		if(type != null) {
			if(type != getType()) {
				tabTest[4] = false;
			}
		}
		if(numCorde != 0) {
			if(numCorde != getNumCorde()) {
				tabTest[5] = false;
			}
		}
		int k = 0;
		while(k<tabTest.length && res) {
		res = tabTest[k];
			k++;
	}
		return(res);
				
		
	}

}

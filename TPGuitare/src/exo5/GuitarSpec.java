package exo5;

public class GuitarSpec extends InstrumentSpec {

	private int numCorde;

	public GuitarSpec(Builder b, String model, Type t, Wood wBack, Wood wTop) {
		super(b, model, t, wBack, wTop);
	}

	public GuitarSpec(Builder b, String model, Type t, int numCorde, Wood wBack, Wood wTop) {
		super(b, model, t, wBack, wTop);
		this.numCorde = numCorde;

	}

	public int getNumCorde() {
		return numCorde;
	}

	public boolean matches(InstrumentSpec searchGuitar) {

		if (!super.matches(searchGuitar)) {
			return false;
		}
		if ((numCorde != 0) && (numCorde != getNumCorde())) {
			return false;
		}

		return (true);

	}

}

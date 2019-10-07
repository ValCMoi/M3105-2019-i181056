package exo5;

public class MandolinSpec extends InstrumentSpec {

	Style s;

	public MandolinSpec(Builder b, String model, Type t, Style s, Wood wBack, Wood wTop) {
		super(b, model, t, wBack, wTop);
		this.s = s;
	}

	public boolean matches(MandolinSpec searchMandolin) {

		Builder b = searchMandolin.getBuilder();
		String model = searchMandolin.getModel();
		Wood topWood = searchMandolin.getTopWood();
		Wood backWood = searchMandolin.getBackWood();
		Type type = searchMandolin.getType();
		Style style = searchMandolin.getStyle();

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

		if ((style != null) && (style != getStyle())) {
			return false;
		}

		return (true);

	}

	public Style getStyle() {
		return this.s;
	}
	
	public boolean matches(InstrumentSpec spec) {

		if (!super.matches(spec)) {
			return false;
		}
		if ((s != null) && (s != getStyle())) {
			return false;
		}

		return (true);

	}

}

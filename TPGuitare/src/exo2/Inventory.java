package exo2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder collings, String model, Type type, Wood backWood,
			Wood topWood) {
		guitars.add(new Guitar(serialNumber, price, collings, model, type, backWood, topWood));
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if (guitar.getSeriealNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public Guitar search(Guitar searchGuitar) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			// Ignore serial number since that's unique
			// Ignore price since that's unique

			Builder builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals(guitar.getBuilder())))
				continue;

			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(guitar.getModel())))
				continue;

			Wood topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals(guitar.getTopWood())))
				continue;

			Wood backWood = searchGuitar.getBackWood();
			if ((backWood != null)  && (!backWood.equals(guitar.getBackWood())))
				continue;

			Type type = searchGuitar.getType();
			if ((type != null)  && (!type.equals(guitar.getType())))
				continue;

			return guitar;
		}
		return null;
	}

}

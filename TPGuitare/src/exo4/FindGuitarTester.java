package exo4;

import java.util.Iterator;
import java.util.List;

import exo4.Builder;
import exo4.Guitar;
import exo4.GuitarSpec;
import exo4.Inventory;
import exo4.Type;
import exo4.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		// Set up Rick's guitar inventory
		Inventory inventory = new Inventory();

		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
				Wood.ALDER);

		List<Guitar> matchinGuitars = inventory.search(whatErinLikes);
		if (!matchinGuitars.isEmpty()) {

			for (Guitar guitar : matchinGuitars) {

				System.out.println("Erin, you might like this " + guitar.getSpec().getBuilder() + " "
						+ guitar.getSpec().getModel() + " " + guitar.getSpec().getType() + " guitar:\n   "
						+ guitar.getSpec().getBackWood() + " back and sides,\n   " + guitar.getSpec().getTopWood()
						+ " top.\nYou can have it for only $" + guitar.getPrice() + "!");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95,
				new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.SITKA));
		inventory.addGuitar("V95693", 1499.95,
				new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("V9512", 1549.95,
				new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("122784", 5495.95,
				new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6, Wood.MAHOGANY, Wood.ADIRONDACK));
		inventory.addGuitar("76531", 6295.95,
				new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		inventory.addGuitar("70108276", 2295.95,
				new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAHOGANY));
		inventory.addGuitar("82765501", 1890.95,
				new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAHOGANY));
		inventory.addGuitar("77023", 6275.95,
				new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		inventory.addGuitar("1092", 12995.95,
				new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 12, Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
		inventory.addGuitar("566-62", 8999.95,
				new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12, Wood.COCOBOLO, Wood.CEDAR));
		inventory.addGuitar("6 29584", 2100.95,
				new GuitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAPLE));
	}
}

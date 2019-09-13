package v3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;

import exo3.Builder;
import exo3.FindGuitarTester;
import exo3.Inventory;
import exo3.Type;
import exo3.Wood;


public class SearchTI {

	private static Inventory inventory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception { 
		inventory = new Inventory();
	    FindGuitarTester.initializeInventory(inventory);
	}

	@Test
	public void testSpecificGuitar() {
	    GuitarSpec whatCustomerWant = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	    List matchingGuitars = inventory.search(whatCustomerWant);
	    
	    Assert.assertNotNull(matchingGuitars);
	    Assert.assertEquals(2, matchingGuitars.size());    
	}
	
	@Test
	public void testElectricGuitar() {
		GuitarSpec whatCustomerWant = new GuitarSpec(null, "", Type.ELECTRIC, null, null);
	    List matchingGuitars = inventory.search(whatCustomerWant);
	    
	    Assert.assertNotNull(matchingGuitars);
	    Assert.assertEquals(5, matchingGuitars.size());    
	}
	
	@Test
	public void testAcousticGuitar() {
		GuitarSpec whatCustomerWant = new GuitarSpec( null, null, Type.ACOUSTIC, null, null);
	    List matchingGuitars = inventory.search(whatCustomerWant);
	    
	    Assert.assertNotNull(matchingGuitars);
	    Assert.assertEquals(6, matchingGuitars.size());    
	}
	
	@Test
	public void testNoMachingGuitar() {
		GuitarSpec whatCustomerWant = new GuitarSpec(Builder.COLLINGS, null, Type.ACOUSTIC, null, Wood.BRAZILIAN_ROSEWOOD);
	    List matchingGuitars = inventory.search(whatCustomerWant);
	    
	    Assert.assertNotNull(matchingGuitars);
	    Assert.assertTrue(matchingGuitars.isEmpty());    
	}

}

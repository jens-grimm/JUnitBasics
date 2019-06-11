/**
 * 
 */
package de.jgrimm.JUnitBasics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author jens
 *
 */
public class TestAsserts {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDown() throws Exception {
		
		System.out.println("tearDown()");
	}

	@Test
	public void testTrue() {
		// fail("Not yet implemented");
		
		assertTrue(true);
	}
	
	@Test
	public void testFalse() {
		// fail("Not yet implemented");
		
		assertFalse(true);
	}


}

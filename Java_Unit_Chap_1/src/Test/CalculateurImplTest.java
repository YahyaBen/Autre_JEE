package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CalculateurImpl;

public class CalculateurImplTest {
	CalculateurImpl A = new CalculateurImpl();
	
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		assertEquals(5,A.add(3,3));

	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubstract() {
		fail("Not yet implemented");
	}

}

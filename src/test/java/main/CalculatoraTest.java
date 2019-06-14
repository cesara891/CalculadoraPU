package main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatoraTest {
	private static ICalculadora calculatora;

	@BeforeClass
	public static void initCalculator() {
		calculatora = new Calculadora();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("Esto se ejecuta antes de cada Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("Esto se ejecuta despuès de cada Test");
	}

	@Test
	public void testSuma() {
		int result = calculatora.suma(3, 4);

		assertEquals(7, result);
	}

	@Test
	public void testDivision() {
		try {
			int result = calculatora.division(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculatora.division(10, 0);
	}

	@Ignore
	@Test
	public void testEqual() {
		boolean result = calculatora.iguales(20, 20);

		assertFalse(result);
	}

	@Ignore
	@Test
	public void testResta() {
		int result = calculatora.resta(10, 3);

		assertTrue(result == 7);
	}
}

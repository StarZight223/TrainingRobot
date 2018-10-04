package training_robot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JustTheBasicsTest {

	@Test
	void testOnlyReturnsZero() {
		JustTheBasics justTheBasics = new JustTheBasics();
		assertEquals(0, justTheBasics.onlyReturnsZero());
	}

	@Test
	void testCalculateXPlusYEquals5() {
		JustTheBasics justTheBasics = new JustTheBasics();
		double result = justTheBasics.calculateXPlusY(2.5, 2.5);
		assertEquals(5.0, result, 0.001 /*delta*/);
	}
	
	@Test
	void testCalculateAbsolutePositive() {
		JustTheBasics justTheBasics = new JustTheBasics();
		assertEquals(3.14, justTheBasics.calculateAbsolute(3.14), 0.001 /* delta*/);
		
	}
	
	@Test
	void testCalculateAbsoluteNegative() {
		JustTheBasics justTheBasics = new JustTheBasics();
		assertEquals(3.14, justTheBasics.calculateAbsolute(-3.14), 0.001 /* delta*/);
		
	}
	
	/* Since everyone knows all the sides for a 3,4,5 triangle, let's
	 * use that as a test case. Providing the sides of 3 and 4 should
	 * return 5 as the hypoteneuse
	 */
	@Test
	void testHypoteneuse_3_4() {
		JustTheBasics justTheBasics = new JustTheBasics();
		double hyp = justTheBasics.calculateHypoteneuse(3.0, 4.0);
		assertEquals(5.0 , hyp, 0.001 /* delta */);
	}

	/* And a triangle with sides of 1 unit each has a hypoteneuse
	 * of radical 2
	 */
	@Test
	void testHypoteneuse_1_1() {
		JustTheBasics justTheBasics = new JustTheBasics();
		double hyp = justTheBasics.calculateHypoteneuse(1.0, 1.0);
		assertEquals(1.414 , hyp, 0.001 /* delta */);
	}

}

package training_robot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JustTheBasicsTest {

	@Test
	void testOnlyReturnsZero() {
		JustTheBasics justTheBasics = new JustTheBasics();
		assertEquals(0, justTheBasics.onlyReturnsZero());
	}

}

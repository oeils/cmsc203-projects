import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
	
	private GradeBook g1;
	private GradeBook g2;

	@Before
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(50);
        g1.addScore(75);
        g1.addScore(90);

        g2.addScore(60);
        g2.addScore(80);
        g2.addScore(95);
	}

	@After
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("50.0 75.0 90.0 "));
		assertEquals(3, g1.getScoreSize());
			
		assertTrue(g2.toString().equals("60.0 80.0 95.0 "));
		assertEquals(3, g2.getScoreSize());
	}

	@Test
	public void testSum() {
		assertEquals(215, g1.sum(), 0.0001);
        assertEquals(235, g2.sum(), 0.0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(50, g1.minimum(), 0.0001);
	    assertEquals(60, g2.minimum(), 0.0001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(165, g1.finalScore(), 0.0001);
		assertEquals(175, g2.finalScore(), 0.0001);
	}

	@Test
	public void testGetScoreSize() {
		assertEquals(3, g1.getScoreSize());
		assertEquals(3, g2.getScoreSize());
	}

	@Test
	public void testToString() {
		assertEquals("50.0 75.0 90.0 ", g1.toString());
		assertEquals("60.0 80.0 95.0 ", g2.toString());
	}

}

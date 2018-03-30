package pro.helderlee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	private StringHelper stringHelper;
	
	@Before
	public void setup() {
		stringHelper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinSecondPosition() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("CAD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinThirdPosition() {
		assertEquals("CDA", stringHelper.truncateAInFirst2Positions("CDA"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_ABCD() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_ABAB() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_AB() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_A() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}

package pro.helderlee;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedStringHelperTest {

	private StringHelper stringHelper;
	
	private String expectedOutput;
	private String input;

	public ParameterizedStringHelperTest(String expectedOutput, String input) {
		this.expectedOutput = expectedOutput;
		this.input = input;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String[][] params = { 
			{ "CD", "AACD" }, 
			{ "CD", "ACD" }, 
			{ "CD", "CAD" }, 
			{ "CDA", "CDA" } 
		};
		return Arrays.asList(params);
	}

	@Before
	public void setup() {
		stringHelper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(this.expectedOutput, stringHelper.truncateAInFirst2Positions(this.input));
	}

}

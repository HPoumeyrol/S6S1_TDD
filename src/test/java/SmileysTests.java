import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import tests1.Smileys;

public class SmileysTests {

	@Test
	public void shouldReturnZeroWithInputNull() {
		assertEquals(0, Smileys.countSmileys(null));
	}
	
	@Test
	public void shouldReturnZeroWithInputEmptyList() {
		List<String> mySmileysList = new ArrayList<String>();
		assertEquals(0, Smileys.countSmileys(mySmileysList));
	}
	
	
	@Test
	public void shouldReturnOneWithInputListWithOneGoodSmiley() {
		List<String> mySmileysList = new ArrayList<String>();
		mySmileysList.add(":+)");
		assertEquals(1, Smileys.countSmileys(mySmileysList));
	}
	
	
}

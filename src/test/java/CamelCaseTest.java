import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tests1.camelCase;

public class CamelCaseTest {

	@Test
	public void shouldReturnEmptyStringIfInputEmptyNull() {
		assertEquals("",camelCase.transform(null));

	}
	
	@Test
	public void shouldReturnEmptyStringIfInputEmptyString() {
		assertEquals("",camelCase.transform(""));

	}
	
	@Test
	public void shouldlowerIfOneWord() {
		assertEquals("test",camelCase.transform("TEST"));

	}

	@Test
	public void testTwoWordsWithSpace() {
		assertEquals("testTest",camelCase.transform("TEST test"));

	}
	
	@Test
	public void testWordsWithNumbersinfinal() {
		assertEquals("test1Test",camelCase.transform("TEST1 test"));

	}

	
	@Test
	public void testWordsWithNumbersinFirst() {
		assertEquals("test1test",camelCase.transform("TEST 1test"));

	}
	
	

	
	@Test
	public void testThreeWordsWithUnderscore() {
		assertEquals("testTest",camelCase.transform("TEST_test"));

	}
	
	
	@Test
	public void camelcase() {
		assertEquals("camelCase",camelCase.transform("camelCase"));

	}
	
	@Test
	public void camelcaseTwoWords() {
		assertEquals("camelCaseCamelCase",camelCase.transform("camelCase camelCase"));

	}
	
	@Test
	public void uppser() {
		assertEquals("oneTwoThree",camelCase.transform("ONE TWO THREE"));

	}
	
	@Test
	public void twospaces() {
		assertEquals("oneTwoThree",camelCase.transform("ONE  TWO__THREE"));

	}
}

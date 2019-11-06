package com.numbertoword.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.numbertoword.impl.NumberToWord;


public class NumberToWordTest {
	
	private NumberToWord  numberToWord = new NumberToWord();
	
	@Test
	public void convertBigNumberTest() {
		String word = numberToWord.convert(123456789);
		assertEquals("one hundred twenty three million four hundred fifty six thousand seven hundred eighty nine", word);
	}
	
	@Test
	public void convertNegativeNumberTest() {
		String word = numberToWord.convert(-22);
		assertEquals("negative twenty two", word);
	}
	
	@Test
	public void convertNumberTest() {
		String word = numberToWord.convert(56945781);
		assertEquals("fifty six million nine hundred forty five thousand seven hundred eighty one", word);
	}

}

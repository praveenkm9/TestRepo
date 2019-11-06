package com.numbertoword.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.numbertoword.main.NumberToWordApplication;

@RunWith(SpringRunner.class)
public class NumbertowordApplicationTests {

	@Test
	public void applicationContextTest() {
		NumberToWordApplication.main(new String[] {});
	}

}

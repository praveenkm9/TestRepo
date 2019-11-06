package com.numbertoword.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.numbertoword.impl.NumberToWord;

@SpringBootApplication
public class NumberToWordApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberToWordApplication.class, args);
		NumberToWord obj = new NumberToWord();
		System.out.println("*** " + obj.convert(56945781));
        System.out.println("*** " + obj.convert(123456789));
        System.out.println("*** " + obj.convert(-55));
	}

}

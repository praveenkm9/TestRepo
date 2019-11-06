package com.numbertoword.impl;

import static com.numbertoword.constants.SpecialNames.specialNames;
import static com.numbertoword.constants.TenNames.tensNames;
import static com.numbertoword.constants.numberNames.numberNames;

public class NumberToWord {
	
	public String convert(int number) {

        if (number == 0) { return "zero"; }
        
        String prefix = "";
        
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }
        
        String current = "";
        int place = 0;
        
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertLessThanOneThousand(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        
        return (prefix + current).trim();
    }
	
	private String convertLessThanOneThousand(int number) {
        String current;
        
        if (number % 100 < 20){
            current = numberNames[number % 100];
            number /= 100;
        }
        else {
            current = numberNames[number % 10];
            number /= 10;
            
            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numberNames[number] + " hundred" + current;
    }

}

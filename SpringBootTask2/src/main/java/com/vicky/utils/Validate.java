package com.vicky.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	
	public static boolean validateSpecialCharacter(String name) {

		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(name);
        boolean isStringContainsSpecialCharacter = matcher.find();
        System.out.println("special char " + isStringContainsSpecialCharacter);
		return isStringContainsSpecialCharacter;
		
	}
	
	public static boolean isFirstCharCapital(String name) {

		return Character.isUpperCase(name.charAt(0));
		
	}
	
		
	
	

}

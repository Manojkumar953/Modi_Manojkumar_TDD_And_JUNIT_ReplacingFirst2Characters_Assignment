package com.epam.TDD.junitTest;

public class ReplaceFirst2Chars {
	public String change(String value) {
		int n = value.length();

		//to change the string value < 2 
		if(n<2) {			
			if(n > 0 && value.charAt(0) == 'A')
					value = "";
		}
		//to change the string value >= 2
		else {
			if(value.charAt(0) == 'A')
				if(value.charAt(1) == 'A')
					value = value.substring(2,n);
				else
					value = value.substring(1,n);
			else if(value.charAt(1) == 'A')
				value = value.substring(0,1) + value.substring(2,n);
		}
		return value;
	}
}

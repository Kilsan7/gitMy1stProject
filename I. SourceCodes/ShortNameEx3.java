// No package! Short Name! Fast Test!
// package com.javalec.forBreakEx;

public class ShortNameEx3 {
	
	public static void main(String[] args) {
		
		String inputid = args[0];
		String password = args[1];
		int checkedResult = 0;

		if (inputid.equals("Seongho")) checkedResult = 2; // id check
		else checkedResult = 3;  // id mismatch
		if (checkedResult ==2 && password.equals("1111")) checkedResult = 1;
		
		switch(checkedResult) {    // Notice: Don't write Switch write switch!!
			case 0:
				System.out.println("Case 0: The id you entered doesn't exist. Please check it.");
				System.out.println("Java is casesensitive so check it out.");
				break;
			case 1:
				System.out.println("Welcome master!");
				break;
			case 2:
				System.out.println("Warning : You entered wrong password!");
				System.out.println("Java is casesensitive so check it out.");
				break;
			default:
				System.out.println("Case 3 : Who are you?");
			
		}

	}
}

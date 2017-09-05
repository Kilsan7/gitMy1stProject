// No package! Short Name! Fast Test!
// package com.javalec.forBreakEx;

public class ShortNameEx2 {
	
	public static void main(String[] args) {
		
		String inputid = args[0];
		String password = args[1];
		
		if (inputid.equals("Seongho")) {
			if (password.equals("1111")){
				System.out.println("Welcome master!");
			} else {
				System.out.println("Warning : You entered wrong password!");
			}
		} else {
			System.out.println("You entered wrong name!");
			System.out.println("Java is casesensitive so check it out.");
		}

	}
}

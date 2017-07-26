package com.javalec.forBreakEx;

public class multiplicationTablesEx {
	
	public static void main(String[] args) {
		
		String inputid = args[0];
		
		if (inputid.equals("Seongho")) {
			System.out.println("Right! Your entered " + inputid + "!");
		} else {
			System.out.println("You entered wrong name!");
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println("\n");
		}
	}
}

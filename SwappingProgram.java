package com.app.swap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwappingProgram {
	
	private static void swapWithTempVariable(int firstNumber, int secondNumber) {
		int tempVariable;
		
		System.out.println("before swap value of firstNumber is :: "+firstNumber);
		System.out.println("before swap value of secondNumber is :: "+secondNumber);
		
		tempVariable = secondNumber;
		secondNumber = firstNumber;
		firstNumber = tempVariable;
		
		System.out.println("after swap value of firstNumber is :: "+firstNumber);
		System.out.println("after swap value of secondNumber is :: "+secondNumber);
	}
	
	private static void swapWithoutTempVariable(int firstNumber, int secondNumber) {
		System.out.println("before swap value of firstNumber is :: "+firstNumber);
		System.out.println("before swap value of secondNumber is :: "+secondNumber);
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("after swap value of firstNumber is :: "+firstNumber);
		System.out.println("after swap value of secondNumber is :: "+secondNumber);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("enter firstNumber :: ");
		int firstNumberWithTemp = Integer.parseInt(br.readLine());
		
		System.out.print("enter secondNumber :: ");
		int secondNumberWithTemp = Integer.parseInt(br.readLine());
		
		SwappingProgram.swapWithTempVariable(firstNumberWithTemp, secondNumberWithTemp);
		
		System.out.println();
		
		System.out.print("enter firstNumber :: ");
		int firstNumberWithoutTemp = Integer.parseInt(br.readLine());
		
		System.out.print("enter secondNumber :: ");
		int secondNumberWithoutTemp = Integer.parseInt(br.readLine());
		
		SwappingProgram.swapWithoutTempVariable(firstNumberWithoutTemp, secondNumberWithoutTemp);

	}

}







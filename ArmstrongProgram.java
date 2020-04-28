package com.app.as;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongProgram {
	
	/*
	 * A positive number is called armstrong number if it is equal to the sum of cubes of its digits 
	 * for example 153
	 * 153 = (1*1*1)+(5*5*5)+(3*3*3)  
	 * where:
	 * (1*1*1)=1 
	 * (5*5*5)=125  
	 * (3*3*3)=27 
	 * So:
	 * 1+125+27=153 
	 */
	
	public static boolean isArmstrongNumber(int number) {
		int sum = 0;
		int flag = number;
		
		while(number != 0) {
			int remainder = number % 10;
			sum = sum + (remainder * remainder * remainder);
			number = number / 10;
		}
		if(flag == sum) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter number :: ");
		int num = Integer.parseInt(br.readLine());
		System.out.println(num+" is armstrong number ? :: "+ArmstrongProgram.isArmstrongNumber(num));
		
		System.out.println();
		
		int armstrongArray[] = {153, 200, 466, 370, 222, 371, 999, 407};
		for(int arm : armstrongArray) {
			System.out.println(arm+" is armstrong number ? :: "+ArmstrongProgram.isArmstrongNumber(arm));
		}
	}
}

package com.app.pp;

import java.util.Scanner;

public class PyramidAndPatternProgram {
	
	private void halfPyramidUsingStars(int rows) {
		int i,j;
		
		for(i = 1; i <= rows; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	private void halfPyramidUsingNumbers(int rows) {
		int i,j;
		
		for(i = 1; i <= rows; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	
	private void halfPyramidUsingAlphabets(int rows) {
		int i,j;
		char alphabets = 'A';
		
		for(i = 1; i <= rows; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(alphabets+" ");
			}
			alphabets++;
			System.out.println("");
		}
	}
	
	private void invertedHalfPyramidUsingStars(int rows) {
		int i,j;
		
		for(i = rows; i >= 1; i--) {
			for(j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	private void invertedHalfPyramidUsingNumbers(int rows) {
		int i,j;
		
		for(i = rows; i >= 1; i--) {
			for(j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	
	private void invertedHalfPyramidUsingAlphabets(int rows) {
		int i,j;
		char alphabets = 'A';
		
		for(i = rows; i >= 1; i--) {
			for(j = 1; j <= i; j++) {
				System.out.print(alphabets+" ");
			}
			alphabets++;
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PyramidAndPatternProgram papp = new PyramidAndPatternProgram();
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter number of rows :: ");
		int rows1 = input.nextInt();
		papp.halfPyramidUsingStars(rows1);
		
		System.out.println("");
		
		System.out.print("enter number of rows :: ");
		int rows2 = input.nextInt();
		papp.halfPyramidUsingNumbers(rows2);
		
		System.out.println("");
		
		System.out.print("enter number of rows :: ");
		int rows3 = input.nextInt();
		papp.halfPyramidUsingAlphabets(rows3);
		
		System.out.println("");
		
		System.out.print("enter number of rows :: ");
		int rows4 = input.nextInt();
		papp.invertedHalfPyramidUsingStars(rows4);
		
		System.out.println("");
		
		System.out.print("enter number of rows :: ");
		int rows5 = input.nextInt();
		papp.invertedHalfPyramidUsingNumbers(rows5);
		
		System.out.println("");
		
		System.out.print("enter number of rows :: ");
		int rows6 = input.nextInt();
		papp.invertedHalfPyramidUsingAlphabets(rows6);
		
		input.close();
	}

}

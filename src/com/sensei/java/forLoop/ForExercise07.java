/**
Objective of the program: 

To retrieve the highest and second highest number in an array of 'n' variables
 */

package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise07 {

	public static void main(String[] args) {
		int[] input = inputData();
		
		int highestNo = 0;
		int secondHighestNo = 0;
		for( int i : input ) {
			if( i > highestNo ) {
				secondHighestNo = highestNo;
				highestNo = i;
			}
			else if( i > secondHighestNo ) {
				secondHighestNo = i;
			}
		}
		System.out.println( "The largest number is " + highestNo );
		System.out.println( "The second largest number is " + secondHighestNo );		
	}

	public static int[] inputData() {
		Scanner sc = new Scanner( System.in );
		
		System.out.print( "Enter the no. of variables in the array: " );
		int input = sc.nextInt();
		int inputArray[] = new int[input];
		
		for( int i=0; i<input; i++ ) {
			System.out.print( "Array variable " + i + " : "  );
			inputArray[i] = sc.nextInt();
		}
		sc.close();
		return inputArray;
	}
}

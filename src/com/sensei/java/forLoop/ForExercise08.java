package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in );
		System.out.print( "Enter the length of the array: " );
		int length = sc.nextInt();
		
		int[] input = new int[length];
		for (int j = 0; j < input.length; j++) {
			System.out.print( "Enter element no. " + j + ": " );
			input[j] = sc.nextInt();
		}
		
		System.out.print( "Enter the number of top elements to retrieve: " );
		int limit = sc.nextInt();
		
		for( int i=input.length; i>=0 ; i-- ) {
			for( int j=0; j<i-1; j++ ) {
				if( input[j] > input[j+1] ) {
					int buffer = input[j];
					input[j] = input[j+1];
					input[j+1] = buffer;
				}
			}
		}
		
		for( int i=input.length-1; i>=input.length-limit; i-- ) {
			System.out.println( input[i] );
		}
		sc.close();
	}
}

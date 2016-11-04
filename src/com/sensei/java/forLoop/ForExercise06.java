/**
Objective of the program: 

Enter the maximum number to print: 5
1234554321
1234  4321
123    321
12      21
1        1
*/
package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "Enter the maximum number to print: " );
		int input = sc.nextInt();
		sc.close();
		
		for( int i=input; i>0; i-- ) {
			int numToPrint = 1;
			for( int j=0; j<2*input; j++ ) {
				if( numToPrint > i ) {
					System.out.print( " " );
				}
				else {
					System.out.print( numToPrint );
				}
				
				if( j == input-1 ) {
					// do nothing as we want the max number to be printed twice
				}
				else if( j >= input-1 ) {
					numToPrint--;
				}
				else {
					numToPrint++;
				}
			}
			System.out.println();
		}
	}
}

/**
Objective of the program: 
 
Please enter a number between and including 1-9 : 5
....1
...2.
..3..
.4...
5....

*/
package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "Please enter a number between and including 1-9 : " );
		int input = sc.nextInt();
		sc.close();
		
		int numToPrint = 1;
		for( int i=input; i>0; i-- ) {
			for( int j=1; j<=input; j++ ) {
				if( j == i ) {
					System.out.print( numToPrint );
					numToPrint++;
				}
				else {
					System.out.print( "." );
				}
			}
			System.out.println();
		}
	}
}

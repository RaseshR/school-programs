/** Objective of the program: 
 * Accept a number from the user and check if it is a special number
 * (Sum of factorials of digits)
 */

package com.sensei.java.whileLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExercise04 {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( 
				            	new InputStreamReader( 
				            		System.in ));
		System.out.print( "Enter a number: " );
		int n = Integer.parseInt( br.readLine() );
		int rev=0, d;
		int input = n;
		
		while( n>0 ) {
			d = n % 10;
			int p = 1;
			
			for( int i=1; i<=d; i++ ) {
				p *= i;
			}
			rev += p;
			n = n / 10;
		}
		if( rev == input ) {
			System.out.println( "Special" );
		}
		else {
			System.out.println( "Not Special" );
		}
	}
}

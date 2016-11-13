/** Objective of the program: 
 * Accept a number from the user and check if it is an armstrong number
 * (Sum of cubes of digits)
 */

package com.sensei.java.whileLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExercise03 {

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
			rev = rev + d*d*d;
			n = n / 10;
		}
		if( rev == input ) {
			System.out.println( "Armstrong" );
		}
		else {
			System.out.println( "Not Armstrong" );
		}
	}
}

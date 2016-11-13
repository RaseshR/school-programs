/** Objective of the program: 
 * Accept a number from the user and reverse it
 */

package com.sensei.java.whileLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExercise01 {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( 
				            	new InputStreamReader( 
				            		System.in ));
		System.out.print( "Enter a number: " );
		int n = Integer.parseInt( br.readLine() );
		int rev=0, d;
		
		while( n>0 ) {
			d = n % 10;
			rev = (rev*10) + d;
			n = n / 10;
		}
		System.out.println( rev );

	}

}

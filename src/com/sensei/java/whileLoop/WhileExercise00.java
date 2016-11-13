/** Objective of the program: 
 * Accept a number from the user and print the sum of its digits
 */

package com.sensei.java.whileLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExercise00 {
	
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( 
				            	new InputStreamReader( 
				            		System.in ));
		System.out.print( "Enter a number: " );
		int n = Integer.parseInt( br.readLine() );
		int sum=0, rem;
		
		while( n>0 ) {
			rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		System.out.println( sum );
		
	}
}

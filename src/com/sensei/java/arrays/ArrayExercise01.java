/** 
Objective of the program:

Accept 20 integer values from the user and print the sum of even and odd numbers
 */

package com.sensei.java.arrays;

import java.io.*;

public class ArrayExercise01 {

	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int a[] = new int[20];
		
		System.out.println( "Enter the values:" ); 
		for( int i=0; i<20; i++ ) {
			a[i] = Integer.parseInt( br.readLine() );
		}
		
		int oddSum  = 0;
		int evenSum = 0;
		
		for( int i=0; i<20; i++ ) {
			if( a[i]%2 == 0 ) {
				evenSum += a[i];
			}
			else {
				oddSum += a[i];
			}
		}
		
		System.out.println( "Sum of odd numbers is " + oddSum );
		System.out.println( "Sum of even numbers is " + evenSum );
	}
}

/** 
Objective of the program:

Accept 10 double values in an array round[] which then rounds off each number to 
the nearest integer
 */

package com.sensei.java.arrays;

import java.io.*;

public class ArrayExercise02 {

	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		double round[] = new double[10];
		
		System.out.println( "Enter the values:" ); 
		for( int i=0; i<10; i++ ) {
			round[i] = Double.parseDouble( br.readLine() );
		}
		
		int a[] = new int[10];
		
		for( int i=0; i<10; i++ ) {
			a[i] = (int) Math.round( round[i] );
		}		
		
		for( int i=0; i<10; i++ ) {
			System.out.println( a[i] );
		}
	}
}

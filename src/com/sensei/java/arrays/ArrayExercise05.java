/** 
Objective of the program:

Accept 10 integers from the user and sort them in ascending order using bubble
 */

package com.sensei.java.arrays;

import java.io.*;

public class ArrayExercise05 {

	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int a[] = new int[10];
		
		System.out.println( "Enter the values:" ); 
		for( int i=0; i<10; i++ ) {
			a[i] = Integer.parseInt( br.readLine() );
		}

		for( int i=0; i<10; i++ ) {
			for( int j=0; j<9; j++ ) {
				if( a[j]>a[j+1] ) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}			
		}
		
		for( int i=0; i<10; i++ ) {
			System.out.println( a[i] );
		}
	}
}

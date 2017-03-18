/** 
Objective of the program:

Accept 10 integers from the user and sort them in ascending order using selection 
sort
 */

package com.sensei.java.arrays;

import java.io.*;

public class ArrayExercise04 {

	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int a[] = new int[10];
		
		System.out.println( "Enter the values:" ); 
		for( int i=0; i<10; i++ ) {
			a[i] = Integer.parseInt( br.readLine() );
		}

		for( int i=0; i<10; i++ ) {
			int pos=i;
			for( int j=i+1; j<10; j++ ) {
				if( a[pos] > a[j] ) {
					pos=j;
				}
			}
			
			int temp = a[i];
			a[i] = a[pos];
			a[pos] = temp;
		}
		
		for( int i=0; i<10; i++ ) {
			System.out.println( a[i] );
		}
	}
}

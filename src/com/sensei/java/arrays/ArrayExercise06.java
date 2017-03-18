/** 
Objective of the program:

Accept 10 integers from the user and output the second largest number and also 
print the location where it occurs
 */

package com.sensei.java.arrays;

import java.io.*;

public class ArrayExercise06 {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int a[] = new int[10];
		
		// Accepting the values from the user
		System.out.println( "Enter the values:" ); 
		for( int i=0; i<10; i++ ) {
			a[i] = Integer.parseInt( br.readLine() );
		}
		
		// creating a copy of the input array. This is the one we actually sort 
		// to find the second largest number.  
		int sortedArray[] = new int[10];
		for( int i=0; i<10; i++ ) {
			sortedArray[i] = a[i];
		}

		// sorting the second array in descending order using bubble sort
		for( int i=0; i<10; i++ ) {
			for( int j=0; j<9; j++ ) {
				if( sortedArray[j] < sortedArray[j+1] ) {
					// swapping values using 'temp' as a temporary variable
					int temp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = temp;
				}
			}			
		}
		
		// getting the second largest number from the sorted array
		int secondLargestNumber = sortedArray[1];
		
		// We then retrieve the location of the second largest number in the 
		// original input array
		// This could have been made faster using binary search but we haven't 
		// learnt that yet!
		for( int i=0; i<10; i++ ) {
			if( a[i] == secondLargestNumber ) {
				System.out.println( secondLargestNumber + " Is the second largest number" );
				System.out.println( "It's index is " + i );
				System.out.println( "It is element no. " + (i+1) + " in the array" );
			}
		}
	}
}

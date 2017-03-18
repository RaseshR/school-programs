/** 
Objective of the program:

Display all prime numbers from an array 'var' containing 10 integers
 */

package com.sensei.java.arrays;

import java.io.*;

public class ArrayExercise03 {

	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int var[] = new int[10];
		
		System.out.println( "Enter the values:" ); 
		for( int i=0; i<10; i++ ) {
			var[i] = Integer.parseInt( br.readLine() );
		}
		
		for( int i=0; i<10; i++ ) {
			int counter = 0;
			for( int j=1; j<=var[i]; j++ ) {
				if( var[i]%j == 0 ) {
					counter++;
				}
			}
			
			if( counter == 2 ) {
				System.out.println( var[i] );
			}
		}
		
	}
}

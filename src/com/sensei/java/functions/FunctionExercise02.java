/** 
Objective of the program: 

Overload a function called 'series' to return the sum of the following series:
1. a+1/2 + a+3/4 + a+5/6 ... n
2. a(a+1) + a(a+2) + a(a+3) ... a

Also, write a main method to ask the user for the values and print both the 
series.
 */
package com.sensei.java.functions;

import java.io.*;

public class FunctionExercise02 {

	public static double series( int a, int n ) {
		double sum = 0;
		double counter = 1;
		for( int i=1; i<=n; i++ ) {
			sum += ((a+counter) / (counter+1));
			System.out.println( a + "+" + counter + "/" + (counter+1) );
			counter += 2;
		}
		
		return sum;
	}
	
	public static double series( int x ) {
		double sum = 0;
		for( int i=1; i<=x; i++ ) {
			sum += x * (x+i);
		}
		return sum;
	}
	
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.print( "Enter 'a': " );
		int A = Integer.parseInt( br.readLine() );
		System.out.print( "Enter 'n': " );
		int N = Integer.parseInt( br.readLine() );
		
		System.out.println( "Sum of series 1 is " + series( A, N ) );
		System.out.println( "Sum of series 2 is " + series( A ) );
	}
}

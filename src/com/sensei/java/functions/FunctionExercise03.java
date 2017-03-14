/**
Objective of the program: 

Using function overloading, caluclate the area of a rhombus, trapezium and 
parallelogram
 */
package com.sensei.java.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionExercise03 {

	public static void area( int b, int h ) {
		System.out.println( "Area of a parallelogram is " + (b*h) );
	}
	
	public static void area( int a, int B, int H ) {
		System.out.println( "Area of a trapezium is " + 0.5*(a+B)*H );		
	}
	
	public static void area( double d1, double d2 ) {
		System.out.println( "Area of a rhombus is " + 0.5*d1*d2 );				
	}
	
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println( "Enter the base and height: " );
		int B = Integer.parseInt( br.readLine() );
		int H = Integer.parseInt( br.readLine() );
		area( B, H );
		
		System.out.println( "Enter the a, b, height: " );
		int A = Integer.parseInt( br.readLine() );
		int b = Integer.parseInt( br.readLine() );
		int h = Integer.parseInt( br.readLine() );
		area( A, b, h );

		System.out.println( "Enter d1, d2: " );
		double D1 = Integer.parseInt( br.readLine() );
		double D2 = Integer.parseInt( br.readLine() );
		area( D1, D2 );

	}

}

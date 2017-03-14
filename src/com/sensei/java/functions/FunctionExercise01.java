/** 
Objective of the program: 

Accept 2 numbers and check whether they are twin primes using the function prime(). 
the function returns 1 if the number is prime, otherwise returns 0. 
Twin primes are numbers whose difference is 2.
 */

package com.sensei.java.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionExercise01 {

	public static void main( String[] args ) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		// Accepting the numbers from the user
		System.out.print( "Enter the first number: " );
		int num1 = Integer.parseInt( br.readLine() );
		System.out.print( "Enter the second number: " );
		int num2 = Integer.parseInt( br.readLine() );		
		
		// storing the returned value of prime in 2 numbers.
		int num1IsPrime = prime( num1 );
		int num2IsPrime = prime( num2 );
		
		// If the sum of num1IsPrime and num2IsPrime is 2, then both the numbers 
		// are primes (prime returns 1 is a number is prime)
		int primeSum = num1IsPrime + num2IsPrime;
		
		// difference can be positive as well as negative. This stores the 
		// positive difference between num1 and num2
		int difference = (num1 > num2) ? num1-num2 : num2-num1;
		
		// if both the numbers are prime and their difference is 2, the numbers 
		// are cyclic primes
		if( primeSum == 2 && difference == 2 ) {
			System.out.println( "Numbers are cyclic primes" );
		}
		else {
			System.out.println( "Numbers are not cyclic primes" );
		}
	}

	// Just checks whether a number is a prime number or not. Returns 1 if it is, 
	// 0 if it isn't
	public static int prime( int num ) {
		int counter = 0;
		for( int i=1; i<num; i++ ) {
			if( num%i == 0 ) {
				counter++;
			}
		}
		
		if( counter == 1 ) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

/**
 * Objective of the program: 
 * 
 * To generate a list of prime numbers within the specified limit
 * This class is accessed by the ForHCF class, hence if you are downloading and 
 * running the files, be sure to download this class in conjunction with the 
 * ForHCF class
 */

package com.sensei.java.forLoop.hard;

import java.util.ArrayList;
import java.util.Scanner;

public class ForPrimeList {
	
	/**
	 * This is where the core logic resides. It goes through every number under 
	 * the limit and divides each number that is below half of the number with
	 * the number. If the remainder is 0, it increments the counter by 1. if the 
	 * value of the counter at the end is 1, it is a prime number and it is added 
	 * to the return list 
	 *  
	 * @param limit - The limit up to which primes are to be generated 
	 * @return primes - A list of prime numbers less than the limit
	 */
	public static ArrayList<Integer> getPrimeList( int limit ) {
		ArrayList<Integer> primes = new ArrayList<>();
		
		for( int i=1; i<=limit; i++ ) {
			int count = 0;
			for( int j=1; j<=i/2; j++ ) {
				if( i%j == 0 ) {
					count++;
				}
			}
			if( count == 1 ) {
				primes.add( i );
			}
		}
		
		return primes; 
	}

	public static void main( String[] args ) {

		Scanner sc = new Scanner( System.in );
		System.out.print( "Enter the limit: " );
		int limit = sc.nextInt();
		ArrayList<Integer> primes = getPrimeList( limit );
		
		for( int i : primes ) {
			System.out.println( i );
		}
		
		sc.close();
	}
}

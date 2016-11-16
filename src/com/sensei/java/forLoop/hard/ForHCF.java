/** 
 * Objective of the Program:
 * 
 * To input n numbers and find the HCF of the numbers. 
 * This class uses some advanced libraries in java.util and also uses a while 
 * loop to get input. It works nicely for now but I am still thinking of a 
 * better, more efficient algorithm
 */

package com.sensei.java.forLoop.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ForHCF {

	public static void main(String[] args) {
		
		System.out.println( "enter quit to break input" );
		ArrayList<Integer> inputs = ForHCF.getInputs();
		int hcf = getHCF( inputs );
		System.out.println( "HCF is " + hcf );
	}
	
	/**
	 * This is where the magic happens. It first retrieves a list of prime 
	 * numbers from the ForPrimeList class via the getPrimeList function with 
	 * the limit being the largest number that is input. It then goes through 
	 * each prime in the list and tries dividing each and every number in the 
	 * input with that number. If all are divided, then it multiplies the hcf 
	 * variable with that number to get the product of the factors. This 
	 * continues until all the numbers in the list are exhausted.  
	 * 
	 * @param inputs - A list of all the input numbers
	 * @return hcf - the hcf of all the input numbers
	 */
	private static int getHCF(ArrayList<Integer> inputs) {
		
		int hcf = 1;
		List<Integer> primes = ForPrimeList.getPrimeList( 
							       Collections.max( 
							           inputs 
							       ) 
							   );
		
		for( int index=0; index<primes.size(); ) {
			int divisor = primes.get(index);
			
			boolean flag = true;
			for( int i=0; i<inputs.size(); i++ ) {
				
				int value = inputs.get(i).intValue();
				if( value % divisor != 0 ) {
					flag = false;
					break;
				}
				else {
					inputs.set( i, value/divisor );
				}
			}
			
			if( flag ) {
				hcf *= divisor;
			}
			else {
				index++;
			}
			
		}
		return hcf;
	}
	
	/** 
	 * A small but important function, this obtains the inputs from the user 
	 * until he/she decides to stop. A simple while loop with the break statement 
	 * is used in this part of the logic.
	 * 
	 * @return inputs - Integer list of all numbers entered by the user
	 */
	public static ArrayList<Integer> getInputs() {
		Scanner sc = new Scanner( System.in );
		ArrayList<Integer> inputs = new ArrayList<>();
		
		while( true ) {
			System.out.print( "> " );
			String input = sc.nextLine();
			
			if( input.equals( "quit" ) ) {
				break;
			}
			else {
				inputs.add( Integer.parseInt( input ) );
			}
		}
		sc.close();
		return inputs;
	}

}

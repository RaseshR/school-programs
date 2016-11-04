/**
Objective of the program:

Please enter the height of the pyramid : 5
    1    
   232   
  34543  
 4567654 
567898765
  
Note: input should be in the range of 1-5
*/
package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "Please enter the height of the pyramid : " );
		int input = sc.nextInt();
		sc.close();
		
		if( input > 5 || input < 1 ) {
			System.out.println( "Please enter a number between 1 and 5" );
			System.exit( -1 );
		}
		
		int midCol = input-1;
		int maxCol = (2*input)-1;
		
		for( int i=1; i<=input; i++ ) {
			int numToPrint = i;
			for( int j=0; j<maxCol; j++ ) {
				
				if( j >= midCol-i+1 && j <= midCol+i-1 ) {
					System.out.print( numToPrint );
					if( j >= midCol ) {
						numToPrint--;
					}
					else {						
						numToPrint++;
					}
				}
				else {
					System.out.print( " " );
				}
			}
			System.out.println();
		}
	}
}

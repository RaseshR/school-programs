/**
Objective of the program:

Please enter the height of the pyramid : 6
     *     
    *0*    
   *000*   
  *00000*  
 *0000000* 
***********

*/
package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "Please enter the height of the pyramid : " );
		int input = sc.nextInt();
		sc.close();
		
		int numCols = (2*input)-1;
		int numRows = input;
		
		int midCol = numCols/2;
		
		for( int i=0; i<numRows; i++ ) {
			
			if( i == numRows - 1 ) {
				for( int j=0; j<numCols; j++ ) {
					System.out.print( "*" );
				}
				break;
			}
			
			for( int j=0; j<numCols; j++ ) {
				
				if( j == midCol + i || j == midCol - i ) {
					System.out.print( "*" );
				}
				else if( j > midCol-i && j < midCol+i ) {
					System.out.print( "0" );
				}
				else {
					System.out.print( " " );
				}
			}
			System.out.println();
		}
	}
}

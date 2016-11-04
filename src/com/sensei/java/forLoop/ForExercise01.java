/**
Objective of the program:

Please enter the height of the pyramid : 4
   *   
  *A*  
 *A*A* 
*A*A*A*

*/
package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "Please enter the height of the pyramid : " );
		int input = sc.nextInt();
		sc.close();

		int numRows = input;
		int numCols = (2*input)-1;
		
		int midCol = numCols/2;
		
		for( int currentRow=0; currentRow<numRows; currentRow++ ) {
			for( int currentCol=0; currentCol<numCols; currentCol++ ) {
				
				if( currentCol >= midCol - currentRow && 
					currentCol <= midCol + currentRow ) {
					
					if( currentCol == midCol + currentRow ) {
						System.out.print( "*" );
					}
					else {
						System.out.print( "*A" );
						currentCol++;
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

/**
Objective of the program: 
 
Please enter the side length of the rhombus : 5
*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********
*
 */
package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "Please enter the side length of the rhombus : " );
		int input = sc.nextInt();
		sc.close();

		int numRows = (2*input)-1;
		int numCols = (2*input)-1;
		
		int midRow = numRows/2;
		int midCol = numCols/2;
		
		int dotLocation = 0;
		for( int currentRow=0; currentRow<numRows; currentRow++ ) {
			for( int currentCol=0; currentCol<numCols; currentCol++ ) {
				
				if( currentCol == midCol - dotLocation || 
					currentCol == midCol + dotLocation ) {
					System.out.print( "*" );
				}
				else if( currentCol > midCol - dotLocation && 
					currentCol < midCol + dotLocation ) {
					System.out.print( " " );
				}
				else {
					System.out.print( "*" );
				}
			}
			if( currentRow >= midRow ) {
				dotLocation--;
			}
			else {
				dotLocation++;
			}
			System.out.println();
		}
	}
}

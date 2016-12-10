/**
Objective of the program:
 
Enter the number of rows: 3
  1   
 2 3  
4 5 6 
 */

package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise10 {
	
	public void printPattern( int nRows ) {
		int numRows = nRows;
		int numColumns = calculateNumColumns( numRows );
		int midColumn = numColumns / 2;
		
		int numToPrint = 1;
		
		for( int i=0; i<numRows; i++ ) {
			for( int j=1; j<=numColumns; j++ ) {
				
				int startCol = midColumn - i;
				int endCol = midColumn + i;
				
				if( j >= startCol && j <= endCol ) {
					System.out.print( numToPrint + " " );
					numToPrint++;
					j++;
				}
				else {
					System.out.print( " " );
				}
				
			}
			System.out.println();
		}	
	}
	
	private int calculateNumColumns( int numRows ) {
		int numColumns = 0;
		int numDigits = 0;
		
		if( numRows == 1 ) {
			numDigits = 1;
		}
		else {
			numDigits = 2*numRows-1;
		}
		
		for( int i=0; i<numDigits; i++ ) {
			numColumns++;
		}
		
		return numColumns+1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		System.out.print( "Enter the number of rows: " );
		int numRows = sc.nextInt();
		sc.close();
		
		new ForExercise10().printPattern( numRows );
		
	}
	
}

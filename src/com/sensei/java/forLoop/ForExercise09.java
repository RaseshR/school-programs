/**
Objective of the program: 

Enter a character: D
ABCDCBA
ABC CBA
AB   BA
A     A
 */
package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise09 {

	public void printPattern( char maxChar ) {
		
		int numRows = maxChar - 'A' + 1 ;
		int numCols = numRows * 2 - 1 ;
		int centerCol = numCols/2 ;
		
		for( int row=0; row<numRows; row++ ) {
			for( int col=0; col<numCols; col++ ) {
				
				char charToPrint = (char)( 'A' + col ) ;
				
				if( charToPrint > maxChar ) {
					charToPrint = (char)(maxChar - ( charToPrint - maxChar )) ;
				}

				int numBlanks = 2*row - 1 ;
				
				int startBlankCol = centerCol - ( numBlanks/2 ) ;
				int endBlankCol   = centerCol + ( numBlanks/2 ) ;
				
				if( numBlanks > 0 && (col >= startBlankCol && col <= endBlankCol) ) {
					System.out.print( ' ' ) ;
				}
				else {
					System.out.print( charToPrint ) ;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
	}
}

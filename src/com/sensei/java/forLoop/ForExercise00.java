/**
Objective of the program: 

Enter the side length of the rhombus: 5
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
Note: this has been done via bitmapping techniques. Other techniques may be 
simpler and it is up to the reader to find and implement them. 
 */

package com.sensei.java.forLoop;

import java.util.Scanner;

public class ForExercise00 {

	static char[][] rhombus;
	
	public static void generateRhombus( int side ) {
		int dimensions = (2*side)-1;
		if( dimensions < 0 ) {
			System.out.println( "Please enter a side greater than 0" );
			System.exit(-1);
		}
		
		int numRows = dimensions;
		int numCols = dimensions;
		
		int maxRow = numRows-1; // Since the array index starts from 0
		int maxCol = numCols-1; // Same as above
		
		int midCol = dimensions/2;
		int midRow = dimensions/2;
				
		rhombus = new char[numRows][numCols];
		
		for( int currentRow=0; currentRow<=midRow; currentRow++ ) {
			for( int currentCol=0; currentCol<=midCol; currentCol++ ) {

				if( currentCol == midRow-currentRow ) {
					rhombus[currentRow][currentCol] = '*';
					rhombus[maxRow-currentRow][currentCol] = '*';
					rhombus[currentRow][maxCol-currentCol] = '*';
					rhombus[maxRow-currentRow][maxCol-currentCol] = '*';
				}
				else {
					rhombus[currentRow][currentCol] = ' ';
					rhombus[maxRow-currentRow][currentCol] = ' ';
					rhombus[currentRow][maxCol-currentCol] = ' ';
					rhombus[maxRow-currentRow][maxCol-currentCol] = ' ';
				}
			}
		}
		
	}
	
	public static void printRhombus() {
		
		for( int currentRow=0; currentRow<rhombus.length; currentRow++ ) {
			for( int currentCol=0; currentCol<rhombus.length; currentCol++ ) {
				System.out.print( rhombus[currentRow][currentCol] );
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.println( "Enter the side length of the rhombus: " );
		int side = sc.nextInt();
		sc.close();
		
		ForExercise00.generateRhombus( side );
		ForExercise00.printRhombus();
	}	
}

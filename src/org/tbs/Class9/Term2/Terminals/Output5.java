/** Output:

9 10 11 12 
10 11 12 
11 12 
12 
 */

package org.tbs.Class9.Term2.Terminals;

public class Output5 {

	public static void main(String[] args) {

		for( int k=9; k<13; k++ ) {
			System.out.println();
			for( int p=k; p<13; p++ ) {
				System.out.print( p + " " );
			}
		}
	}
}

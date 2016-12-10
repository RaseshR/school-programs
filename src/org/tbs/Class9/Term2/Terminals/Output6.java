/** Output:

3 
6 9 
12 15 18 
21 24  
 */

package org.tbs.Class9.Term2.Terminals;

public class Output6 {

	public static void main(String[] args) {

		for( int i=0,p=3; i<=4; i++ ) {
			System.out.println();
			
			for( int j=0; p<27 && j<=i; p+=3, j++ ) {
				System.out.print( p + " " );
			}
		}
	}
}

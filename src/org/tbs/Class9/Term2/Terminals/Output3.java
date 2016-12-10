/** Output:
2256
225
22
 */

package org.tbs.Class9.Term2.Terminals;

public class Output3 {

	public static void main(String[] args) {

		int q = 2256;
		do { 
			
			System.out.println( q );
			q = q/10;
		}while( q > 20 );
	}
}

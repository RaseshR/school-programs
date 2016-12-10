/** Output:
1
2
3
4
 */

package org.tbs.Class9.Term2.Terminals;

public class Output4 {

	public static void main(String[] args) {

		boolean flag = true;
		while( flag ) {
			for( int i=1; flag; i++ ) {
				System.out.println( i );
				if( i==4 ) {
					flag = false;
				}
			}
		}
	}
}

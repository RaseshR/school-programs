/**
 * This program was meant to be coded in without the log statement in the for 
 * loop. the log is just for understanding. sum in the end equals 3006
 */

package org.tbs.Class9.Term2.UnitTests;

public class Program1 {

	public static void main(String[] args) {
		int sum = 0;
		for( int i=2; i<=10; i++ ) {
			int num = (i*i*i)-2;
			System.out.println( "Log: added " + num );
			sum += num;
		}
		System.out.println( sum );
	}
}

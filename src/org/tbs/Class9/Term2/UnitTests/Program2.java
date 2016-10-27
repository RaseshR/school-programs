package org.tbs.Class9.Term2.UnitTests;

import java.io.*;

public class Program2 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( 
				System.in ) );
		System.out.println( "Enter a no. : " );
		int n = Integer.parseInt( br.readLine() );
		int sum=0;
		for( int i=1; i<n; i++ ) {
			if( n%i == 0 ) {
				sum += i;
			}
		}
		
		if( n == sum ) {
			System.out.println( "Perfect" );
		}
		else {
			System.out.println( "not perfect" );
		}
	}
}

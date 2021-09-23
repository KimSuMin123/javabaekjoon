package bronzev;

import java.math.BigInteger;
import java.util.Scanner;

public class party {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[5];
	
		int p = sc.nextInt();
		int a = sc.nextInt();
		int r = p * a;
		
	    for ( int i = 0; i < 5; i++ ) {
	    	
	    	arr1[i] = sc.nextInt();
	    	System.out.printf( arr1[i] - r + " ");
	    }
	}
}

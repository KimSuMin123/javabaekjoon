package bronzev;

import java.math.BigInteger;
import java.util.Scanner;

public class add9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
	    BigInteger b = sc.nextBigInteger();
	    
	    System.out.println(a.add(b));
	}
}

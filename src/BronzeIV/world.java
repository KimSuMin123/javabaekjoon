package BronzeIV;

import java.util.Scanner;

public class world {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		System.out.println(Math.abs(n - m));
	}
}

package BronzeIV;

import java.util.Scanner;

public class waterbill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int x = a * e;
		int y = 0;
		
		if(e <= c) {
			y = b;
		}else {
			y = b + (e - c) * d;
		}
		
		if(x > y) {
			System.out.println(y);
		}else {
			System.out.println(x);
		}
	}
}

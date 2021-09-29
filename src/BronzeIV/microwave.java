package BronzeIV;

import java.util.Scanner;

public class microwave {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		if (t % 10 != 0) {
			System.out.println("-1");
		}
		else {
			int a = t / 300;
			t -= 300 * a;
			int b = t / 60;
			t -= 60 * b;
			int c = t / 10;
			t -= 10 * a;
			System.out.println(a + " " + b + " " + c);
		}
	}
}

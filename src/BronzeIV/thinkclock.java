package BronzeIV;

import java.util.Scanner;

public class thinkclock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		
		int t = s + p;
		
		while(t > 59) {
			m++;
			t -= 60;
		}
		while(m > 59) {
			h++;
			m -= 60;
		}
		while(h > 23) {
			h -= 24;
		}
		System.out.printf("%d %d %d", h, m, t);
	}
}

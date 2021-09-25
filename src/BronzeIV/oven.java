package BronzeIV;

import java.util.Scanner;

public class oven {

	public static void main(String[] args) {
		
		int h,m,t;
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		m = sc.nextInt();
		t = sc.nextInt();
		
		m = t + m; 
		
		while(m > 59) {
			h++;
			m -= 60;
		}
		while(h > 23) {
			h -= 24;
		}
		System.out.printf("%d %d",h,m);
	}
}

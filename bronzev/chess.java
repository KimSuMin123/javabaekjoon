package bronzev;

import java.util.Scanner;

public class chess {

	public static void main(String[] args) {
		
		int k = 1, q = 1, l = 2, b = 2, n = 2, p = 8;
		Scanner sc = new Scanner(System.in);
		int wk = sc.nextInt();
		int wq = sc.nextInt();
		int wl = sc.nextInt();
		int wb = sc.nextInt();
		int wn = sc.nextInt();
		int wp = sc.nextInt();
		
		System.out.printf( "%d %d %d %d %d %d",k - wk, q - wq, l - wl, b - wb, n - wn, p - wp);
	}
}

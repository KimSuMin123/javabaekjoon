package bronzev;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int t = sc.nextInt();
		int p = sc.nextInt();
		
		System.out.println((n - 1) / t * c * p);
	}
}

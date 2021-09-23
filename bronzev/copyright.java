package bronzev;

import java.util.Scanner;

public class copyright {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int avg = sc.nextInt();
		
		System.out.println((cnt  * (avg - 1)) + 1 );
	}
}

package bronzev;

import java.util.Scanner;

public class time {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int x = (a + b + c + d) / 60;
		int y = (a + b + c + d) % 60;
		System.out.println(x);
		System.out.println(y);
	}
}

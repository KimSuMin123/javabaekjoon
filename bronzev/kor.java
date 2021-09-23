package bronzev;

import java.util.Scanner;

public class kor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		char r = a.charAt(0);
		System.out.println(((int) r ) - 44031 );
	}
}

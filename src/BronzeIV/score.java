package BronzeIV;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		int d1 = sc.nextInt();
		
		int S = a + b + c + d; 
		int T = a1 + b1 + c1 + d1; 
		
		if(S > T) {
			System.out.println(S);
		}else if(T > S) {
			System.out.println(T);
		}else if(T == S) {
			System.out.println(S);
		}
	}
}

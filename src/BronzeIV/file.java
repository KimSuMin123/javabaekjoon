package BronzeIV;

import java.util.Scanner;

public class file {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = 0;
		
		if(a + d > b + c){
			e = b + c;
		}else {
			e = a + d;
		}
		System.out.println(e);
	}
}

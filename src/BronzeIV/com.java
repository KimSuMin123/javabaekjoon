package BronzeIV;

import java.util.Scanner;

public class com {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i = 1;
		
		if(a + b * i > c * i) {
			i = i + 1;	
		}
		
		System.out.println(i);
			
	}

}

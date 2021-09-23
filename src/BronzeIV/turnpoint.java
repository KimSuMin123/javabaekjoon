package BronzeIV;

import java.util.Scanner;

public class turnpoint {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();	    
	   
		int r;
		if(b > c) {
			r = -1;
		}else {
			r = a / (c - b) + 1;
		}
		System.out.println(r);
	}
}

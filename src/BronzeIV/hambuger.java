package BronzeIV;

import java.util.Scanner;

public class hambuger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt(); 
		int e = sc.nextInt();
		
		int min = 3000;
		
		int[] data = {a + d, a + e, b + d, b + e, c + d, c + e};
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] < min) {
				min = data[i];
			}
		}
		System.out.println(min - 50);
	}
}

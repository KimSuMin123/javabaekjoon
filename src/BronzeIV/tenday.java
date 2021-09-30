package BronzeIV;

import java.util.Scanner;

public class tenday {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int i, cnt = 0;
		
		for(i = 0; i < 5; i++) {
			if(a == sc.nextInt()) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}

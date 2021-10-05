package BronzeIV;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int arr[] = {a, b, c, d};
		int sum = a + b + c + d;
		int min = 1000;
		
		for(int i = 0; i < 4; i++) {
			for(int j = i + 1; j < 4; j++) {
				int gap, hap1, hap2 = 0;
				hap1 = arr[i] + arr[j];
				hap2 = sum - hap1;
				
				if(hap1 < hap2) {
					gap = hap2 - hap1;
				}else {
					gap = hap1 - hap2;
				}
				min = Math.min(min, gap);
			}
		}
		System.out.println(min);
	}
}


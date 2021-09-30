package BronzeIV;

import java.util.Scanner;

public class cupon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double []arr = new double [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
			double sum = arr[i] * 0.8;
			System.out.println("$" + String.format("%.2f", sum));
		}
	}
}

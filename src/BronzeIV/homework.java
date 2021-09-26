package BronzeIV;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(); 
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt(); 
		int D = sc.nextInt(); 
		
		int a = B / D;
		int b = A / C;
		
		if(a > b && B % D == 0) {
			System.out.printf("%d", L - a);
		}else if(a > b && B % D != 0){
			System.out.printf("%d", L - a - 1);  
		}else if(a < b && A % C == 0){
			System.out.printf("%d", L - b);  
		}else if(a < b && A % C != 0) {
			System.out.printf("%d", L - b - 1);
		}
	}
}

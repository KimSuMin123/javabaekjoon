package BronzeIV;

import java.util.Arrays;
import java.util.Scanner;

public class threenum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		int A, B, C; 
		
		arr[0] = A = sc.nextInt();
		arr[1] = B = sc.nextInt();
		arr[2] = C = sc.nextInt();
		
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}

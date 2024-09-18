package studio3;

import java.util.Scanner;

public class sieveoferatosthenes {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of integers");
		int n = in.nextInt();
		boolean [] array = new boolean[n+1];
		
		for (int i=0; i < array.length; i++ ) {
			array[i] = true;
			
		}
		
		for (int p=2 ; p*p <= n ; p++) {
			if (array[p] == true) {
				for (int multiple = p * p; multiple <= n; multiple += p) {
					array[multiple] = false;
				}
			}
			
		}
		
		System.out.println("Prime numbers up to " + n + ": ");
		for (int i=2 ; i<= n ; i++ ) {
			if (array [i] == true) {
				System.out.print(i+ " ");
			}
		}
		
		
	}

}

package arrayafter;

import java.util.Scanner;

public class Peter_England_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Buy 4 Get 5 offer  
		// price of the cloths are 1999,1699,1799,1499,1799,1499,1899,1499,1799
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of the cloths: ");
		int[] ar = new int[9];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int temp = 0;
		int k = 1;

		for (int j = 0; j < ar.length - 1; j++) {
			for (int i = 0; i < ar.length - k; i++) {

				if (ar[i] < ar[i + 1]) {
					temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}
			}
			k++;
		}

		int sum = 0;
		for (int i = 0; i < ar.length - 5; i++) {

			sum = sum + ar[i];
//			System.out.println(ar[i] + " ");
		}
		System.out.println("Price of the cloths is " + sum + " Rupees");

		System.out.println("Price of one cloth is " + sum / ar.length + " Rupees");

	}

}

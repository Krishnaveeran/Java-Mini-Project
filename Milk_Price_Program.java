package arrayafter;

import java.util.Scanner;

public class Milk_Price_Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days ");
		int N = sc.nextInt();
		float[][] milk = new float[N][2];

		for (int i = 0; i < milk.length; i++) {
			System.out.println("Enter day " + (i + 1) + " morning milk in litres");
			milk[i][0] = sc.nextFloat();
			System.out.println("Enter day " + (i + 1) + " evening milk in litres");
			milk[i][1] = sc.nextFloat();
		}

		float sum = 0;
		for (int i = 0; i < milk.length; i++) {
			sum = sum + milk[i][0] + milk[i][1];
		}
		int price = 33;
		System.out.println("Amount for this month " + sum * price + " Rupees");

	}

}

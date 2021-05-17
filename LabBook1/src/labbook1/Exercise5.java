package labbook1;

import java.util.Scanner;

public class Exercise5 {

	public int calculateSum(int n) {
		int S1, S2, S3;

		S1 = ((n / 3)) * (2 * 3 + (n / 3 - 1) * 3) / 2;
		S2 = ((n / 5)) * (2 * 5 + (n / 5 - 1) * 5) / 2;
		S3 = ((n / 15)) * (2 * 15 + (n / 15 - 1) * 12) / 2;

		int sum = S1 + S2 - S3;
		return sum;
	}

	public static void main(String[] args) {
		Exercise5 ex = new Exercise5();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value:");
		int n = sc.nextInt();
		System.out.println(ex.calculateSum(n));
		sc.close();
	}
}

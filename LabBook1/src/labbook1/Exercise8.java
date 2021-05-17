package labbook1;

import java.util.Scanner;

public class Exercise8 {
	public boolean checkNumber(int n) {
		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1) {
			return true;
		} else {

			return false;
		}

	}

	public static void main(String[] args) {
		Exercise8 ex = new Exercise8();
		System.out.println("enter the n value:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(ex.checkNumber(n));
		sc.close();

}

}

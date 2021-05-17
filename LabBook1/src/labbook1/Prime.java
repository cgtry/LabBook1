package labbook1;

import java.util.Scanner;

public class Prime {
	int n;

	public void primeInteger() {
		int p;
		for (int i = 2; i < n; i++) {
			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					p = 1;
			}
			if (p == 0)
				System.out.println(i);

		}
	}

	public static void main(String[] args) {
		Prime prime = new Prime();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		prime.n = s.nextInt();
	
	}

}

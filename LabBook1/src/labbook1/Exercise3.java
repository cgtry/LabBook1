package labbook1;

import java.util.Scanner;

class Function {
	void nonRecursive(int a, int b, int c, int n) {
		for (int i = 1; i <= n - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		a = b = 1;
		System.out.println("nth value in the series using non recursive function is : " + c);

	}

	void recursive(int a, int b, int c, int n) {

		if (n - 2 > 0) {
			c = a + b;
			a = b;
			b = c;
			recursive(a, b, c, n - 1);
			return;
		}

		System.out.println("\nnth value in the series using recursive function is : " + c);
	}
}

public class Exercise3 {
	public static void main(String args[]) {
		Function f = new Function();
		int n, a = 1, b = 1, c = 0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter n value:  ");
		n = scr.nextInt();
		f.nonRecursive(a, b, c, n);
		f.recursive(a, b, c, n);
		scr.close();

	}
}

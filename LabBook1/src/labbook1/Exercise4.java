package labbook1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 1)
				System.out.println(i + " ");
		}
		scanner.close();

	}

}

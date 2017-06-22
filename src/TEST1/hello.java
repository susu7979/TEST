package TEST1;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A;

		while (scanner.hasNext()) {
			A = scanner.nextInt();

			if (A % 4 == 0 && A % 100 != 0)
				System.out.println("¶|¦~");
			else
				System.out.println("¥­¦~");

		}
	}
}

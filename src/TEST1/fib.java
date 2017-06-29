package TEST1;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		while (scan.hasNext()) {
			a = scan.nextInt();
			int num[] = new int[a];
			if (a <= 1) {
				System.out.println(1);
			} else {
				num[0] = 1;
				num[1] = 1;
				for (int i = 2; i < a; i++) {
					num[i] = num[i - 1] + num[i - 2];
				}
				System.out.println(num[a - 1]);
			}
		}
	}
}

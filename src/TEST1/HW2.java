package TEST1;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		int a, b;
		String YN;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Input first number: ");
			a = scanner.nextInt();
			System.out.print("Input second number: ");
			b = scanner.nextInt();
			System.out.println(a + "+" + b + "=" + (a + b));
			System.out.println(a + "-" + b + "=" + (a - b));
			System.out.println(a + "*" + b + "=" + (a * b));
			System.out.println(a + "/" + b + "=" + (a / b));
			System.out.println(a + "%" + b + "=" + (a % b));
			System.out.print("�O�_�A���@��(Y/N): ");
			YN = scanner.next();
			while (!YN.equals("N") && !YN.equals("Y")) {
				System.out.println("�Э��s��J");
				System.out.print("�O�_�A���@��(Y/N): ");
				YN = scanner.next();
			}
		} while (YN.equals("Y"));
		System.out.println("�����o�I�T�T");
	}
}
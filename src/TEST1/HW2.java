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
			System.out.print("是否再玩一次(Y/N): ");
			YN = scanner.next();
			while (!YN.equals("N") && !YN.equals("Y")) {
				System.out.println("請重新輸入");
				System.out.print("是否再玩一次(Y/N): ");
				YN = scanner.next();
			}
		} while (YN.equals("Y"));
		System.out.println("結束囉！掰掰");
	}
}
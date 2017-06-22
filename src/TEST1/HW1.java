package TEST1;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		int num1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("½Ð¿é¤J¼Æ¦r:");
		num1 = scanner.nextInt();
		mt(num1);
	}

	public static void mt(int max) {
		int i;
		int g;
		for (i = 1; i <= max; i = i + 1) {
			for (g = 1; g <= max; g = g + 1) {
				if (i * g < 10) {
					System.out.print(i + "*" + g + "=" + (i * g) + "  ");
				} else {
					System.out.print(i + "*" + g + "=" + (i * g) + " ");
				}
			}
			System.out.println();
		}
	}
}

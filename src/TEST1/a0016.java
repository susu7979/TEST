package TEST1;

import java.util.Arrays;
import java.util.Scanner;

public class a0016 {

	public static boolean checkRow(int[] num) {
		int a;
		for (int i = 1; i < 10; i++) {
			a = Arrays.binarySearch(num, i);
			if (a >= 0)
				continue;
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[9];
		while (scan.hasNext()) {
			for (int i = 0; i < 9; i++) {
				num[i] = scan.nextInt();
			}
			boolean a;
			a = checkRow(num);
			System.out.println(a);
		}
		scan.close();
	}
}

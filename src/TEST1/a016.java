package TEST1;

import java.util.Arrays;
import java.util.Scanner;

public class a016 {

	public static boolean checkRow(int[] num) {
		int a;
		for (int i = 1; i < 10; i++) {
			Arrays.sort(num);
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
		int[][] num = new int[9][9];
		int[][] num2 = new int[9][9];
		while (scan.hasNext()) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					num[i][j] = scan.nextInt();
					num2[i][j] = num[j][i];
				}
			}
			System.out.print(num2);
//			boolean a, b;
//			for (int i = 0; i < 9; i++) {
//				a = checkRow(num[i]);
//				b = checkRow(num2[i]);
//				System.out.print(a+" ");
//				System.out.println(b);
			}
			
		}
//		scan.close();
	}
//}

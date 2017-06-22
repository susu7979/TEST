package TEST1;

import java.util.Scanner;

public class a005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] array = new int[20][5];
		while (sc.hasNext()) {
			int a = sc.nextInt();
			while (0 <= a && a <= 20) {
				for (int i = 0; i < a; i++) {
					for (int j = 0; j < 4; j++) {
						array[i][j] = sc.nextInt();
					}
				}
			}
			for (int i = 0; i < a; i++) {
				if (array[i][3] % array[i][2] == 0 && array[i][2] % array[i][1] == 0
						&& array[i][1] % array[i][0] == 0) {
					array[i][4] = array[i][3] * (array[i][3] / array[i][2]);
				} else if ((array[i][3] - array[i][2]) == (array[i][2] - array[i][1])
						&& (array[i][2] - array[i][1]) == (array[i][1] - array[i][0])) {
					array[i][4] = array[i][3] + (array[i][3] - array[i][2]);
				}
				for (int d = 0; d < 5; d++) {
					System.out.println(array[i][d] + " ");
				}
				System.out.println();
			}
		}
	}
}

package TEST1;

import java.util.Scanner;

public class a006 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a, b, c;
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			int i, roots1, roots2;
			i = ((b * b) - (4 * a * c));
			roots1 = (int) ((-b + Math.sqrt(i)) / (2 * a));
			roots2 = (int) ((-b - Math.sqrt(i)) / (2 * a));
			if (i >= 0) {
				if (roots1 > roots2) {
					System.out.println("Two different roots " + "x1=" + roots1 + " , x2=" + roots2);
				} else if (roots1 == roots2) {
					System.out.println("Two same roots x=" + roots1);
				}
			}
			else{
			System.out.println("No real root");
			}
		}
	}
}

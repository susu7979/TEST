package TEST1;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {

		Scanner scan = new Scanner("This an example string");

		while (scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
	}
}
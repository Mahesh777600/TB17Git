package LogicalProgram;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value");
		int a = sc.nextInt();

		System.out.println("Enter b value");
		int b = sc.nextInt();

		System.out.println("Enter c value");
		int c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("A is Greater");
			} else {
				System.out.println("C is Greater");
			}
		} else if (b > c) {
			System.out.println("B is Greater");
		} else {
			System.out.println("C is Greater");
		}
	}
}

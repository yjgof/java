package 과제2;

import java.util.Scanner;

public class 도전과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int n = scanner.nextInt();
		scanner.close();

		int a = 1;
		int i = 1;
		while (i <= n) {
			a *= i;
			i++;
		}

		System.out.println("팩토리얼 값: " + a);

	}

	public class FactorialTest {
		public static int calculateFactorial(int n) {
			int a = 1;
			int i = 1;
			while (i <= n) {
				a *= i;
				i++;
			}
			return a;
		}
	}
}

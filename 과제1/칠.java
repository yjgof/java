package 과제1;

import java.util.Scanner;

public class 칠 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int s = a.nextInt();

		boolean d = (s % 4 == 0);
		boolean f = (s % 5 == 0);
		boolean result = (d && f) || (d || f) || (d ^ f);
		System.out.println(result);

		a.close();

	}

}

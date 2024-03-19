package 과제1;

import java.util.Scanner;

public class 팔 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner q = new Scanner(System.in);

		System.out.print("0부터 999 사이의 정수를 입력하세요: ");
		int a = q.nextInt();
		int b = 0;
		b += a % 10;
		a /= 10;
		b += a % 10;
		a /= 10;
		b += a;

		System.out.println("각 자릿수를 더한 결과는 " + b + "입니다.");

		q.close();
	}

}

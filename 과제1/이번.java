package 과제1;

import java.util.Scanner;

public class 이번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner q = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int a = q.nextInt();
		int s = a * a;
		System.out.println(a + "의 제곱 값은 " + s + "입니다.");
		q.close();

	}

}

package 과제1;

import java.util.Scanner;

public class 사 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.print("초를 입력하세요: ");
		int b = a.nextInt();
		int c = b / 3600;
		int d = b % 3600;
		int e = d / 60;
		int f = d % 60;

		System.out.println(b + "초는 " + c + "시간 " + e + "분 " + f + "초입니다.");
		a.close();
	}
}
package 과제1;

import java.util.Scanner;

public class 구 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner q = new Scanner(System.in);
		System.out.print("전공 학점 : ");
		int a = q.nextInt();
		System.out.print("교양 학점 : ");
		int b = q.nextInt();
		System.out.print("일반 학점 : ");
		int c = q.nextInt();
		boolean d = (a >= 70) && ((b >= 30 && c >= 30) || (b + c >= 80));

		System.out.println(d ? "졸업 가능" : "졸업 불가능");

		q.close();
	}

}

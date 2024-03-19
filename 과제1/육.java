package 과제1;

import java.util.Scanner;

public class 육 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하세요: ");
		double c = a.nextDouble();
		double b = (c - 32) * 5 / 9;
		System.out.println("섭씨 온도는 " + b + "도 입니다.");

		a.close();
	}

}

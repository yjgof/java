package 과제1;

import java.util.Scanner;

public class 삼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름을 입력하세요 : ");
		double s = a.nextDouble();
		System.out.print("원기둥의 높이를 입력하세요 : ");
		double d = a.nextDouble();
		double z = Math.PI * s * s * d;
		System.out.println("원기둥의 부피는 " + z + "입니다.");

		a.close();

	}

}

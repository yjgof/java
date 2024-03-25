package 과제2;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int s = a.nextInt();

		if (s >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");

	}

}

package 과제2;

import java.util.Scanner;

public class 문제2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("등수 입력 : ");
		int s = a.nextInt();

		switch (s) {
		case 1:
			System.out.println("아주 잘함");
			break;
		case 2:
		case 3:
			System.out.println("잘함");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("노력");
			break;
		}
	}
}

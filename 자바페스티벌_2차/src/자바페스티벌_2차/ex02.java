package 자바페스티벌_2차;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N입력: ");
		int count = sc.nextInt();
		System.out.println("x입력: ");
		int num = sc.nextInt();
		int su[] = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			int j = sc.nextInt();
			if (j < num) {
				su[i] = j;
			} else {
				su[i] = 0;
			}
		}
		System.out.print("결과 >> ");
		for (int i = 0; i < su.length; i++) {
			if (su[i] > 0) {
				System.out.print(su[i] + " ");

			}

		}

	}

}

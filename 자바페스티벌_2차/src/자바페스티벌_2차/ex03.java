package 자바페스티벌_2차;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		int a = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = a;
				} else {
					arr[i][(arr[i].length - 1) - j] = a;
				}
				a++;
			}

		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

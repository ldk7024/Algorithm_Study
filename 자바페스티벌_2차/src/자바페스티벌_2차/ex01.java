package 자바페스티벌_2차;

import java.util.Random;

public class ex01 {

	public static void main(String[] args) {
		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화

		// 가장 큰수와 작은 수를 각각 출력

		Random r = new Random();
		int[] arr = new int[8];
		int max = 0;
		int min = 0;
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;

			if (i == 0) {
				max = arr[i];
				min = arr[i];
			}
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("가장 큰 값 :" + max);
		System.out.println("가장 작은 값:" + min);

	}

}

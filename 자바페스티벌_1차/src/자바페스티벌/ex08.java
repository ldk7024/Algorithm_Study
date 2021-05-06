package 자바페스티벌;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력:");
		int num = sc.nextInt();
		
		// 출력되는 수열을 기억하고 있을 변수
		int sum =1;
		for (int i = 1 ; i<=num ; i++) {
			System.out.print(sum+ " ");
		   sum+=i;   // 1-> 2 -> 4 -> 7 수열의 연산 필요
		}

	}

}

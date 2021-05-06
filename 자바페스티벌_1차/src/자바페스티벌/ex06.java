package 자바페스티벌;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// 1. 정수를 입력받기
		// 2. 1의 자리 수 확인하기
		// 3. 1의 자리 수가 반올림이 가능한지 판단하기
		// 4. 결과를 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: " );
        int num = sc.nextInt();
        
        if (num%10<5) {
        	System.out.println("반올림 수"+(num-(num%10)));
        	}
        else {System.out.println("반올림 수"+(num+(10-(num%10))));
        }
	
	
	
	
	}

}

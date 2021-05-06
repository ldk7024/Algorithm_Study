package 자바페스티벌;

import java.util.Scanner;

public class ex06_개꿀코드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력 : ");
        int num = sc.nextInt();

        System.out.println("반올림 수: " + ((num + 5) / 10 * 10));
       
	}

}

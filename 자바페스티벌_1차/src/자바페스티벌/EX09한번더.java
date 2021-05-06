package 자바페스티벌;

import java.util.Scanner;

public class EX09한번더 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	      System.out.print("소인수분해 할 수를 입력하세요. : ");
	      int num = sc.nextInt();
	      int div = 2;

	      System.out.print(num + " = ");

	      while(num>=div) {                     //입력된 숫자가 나눠야할 숫자보다 크거가 같을 때까지 반복

	         if(num%div == 0) {                      //만약 나누어 떨어졌을 때

	            if(num != div) {               //만약 입력된 숫자와 나눠야할 숫자가 서로 다를 경우
	               System.out.print(div + "*");   //나누어 떨어지게 한 숫자와 *를 출력
	            }else {
	               System.out.print(div);         //나누어 떨어지게 한 숫자만 출력
	            }

	            num = num/div;                  //기존에 있던 num 값에 몫을 대입한다. EX) 만약 24/2==0 일 때, 이 때의 몫인 12를 num에 대입
	            div = 1;                     //div를 다시 1로 설정한 뒤에 div++를 통해 다시 2부터 나누어떨어지는지 확인을 시킨다
	            }

	         div++;                           //if문의 조건에 만족하지 않으면 그대로 div 값에 1이 더해지고 반복된다
	         }

	}

}

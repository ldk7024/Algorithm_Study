import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게: ");
		int now = sc.nextInt();
		System.out.print("목표몸무게: ");
		int target = sc.nextInt();
		int week =1;
		while(now>target) {
		System.out.print(week+"주차 감량 몸무게: ");
		int sum = sc.nextInt();
		week++;
		now-=sum;
		}
        System.out.println(now+"kg"+"달성!! 축하합니다!");
	}

}

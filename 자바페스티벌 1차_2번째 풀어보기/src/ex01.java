import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.print("현재몸무게: ");
     int now = sc.nextInt();
     System.out.print("목표몸무게: ");
     int target = sc.nextInt();
     int week = 0;
      while(target<now) {
    	week++;
    	System.out.print(week + "주차 감량 몸무게: ");
    	int num = sc.nextInt();
    	now-=num;
    	 }
	   System.out.println(now + "kg 달성!! 축하합니다!");
	}

}

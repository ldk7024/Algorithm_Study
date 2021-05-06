package 자바페스티벌;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("현재 몸무게: ");
        int now = sc.nextInt();
        System.out.print("목표 몸무게:");
        int target = sc.nextInt();
	    int week = 0; 
        while (target<now) {
        	week ++;
        	System.out.print(week + "주차 감량몸무게");
        	int sum = sc.nextInt();
	    	now-=sum;
	    	
	    }
	      System.out.println(now + "kg 달성!! 축하합니다!");
	
	
	
	
	}

}

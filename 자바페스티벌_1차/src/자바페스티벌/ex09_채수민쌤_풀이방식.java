package 자바페스티벌;

import java.util.Scanner;

public class ex09_채수민쌤_풀이방식 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 >> ");
		int input = sc.nextInt();
		
		// 2로부터 시작해서 어떠한 수로 바뀔 수 있습니다.	
	    for(int i = 2 ; i<= input ; i++) {
	    	while(input%i ==0) {
	    		input /= i;
	    		System.out.print(i);
	    		if(i<input) {System.out.print("*");
	    		}
	    	}
	    }	
	
	
	}

}

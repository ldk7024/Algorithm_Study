package 자바페스티벌_2차;

import java.util.Random;

public class ex07 {

	public static void main(String[] args) {
      // 랜덤 사용하기
      Random rd = new Random();
      
      //로또 번호를 담을 배열
      int lotto[] = new int[6];
	
      for(int i = 0 ; i<lotto.length; i++) {
    	  lotto[i] = rd.nextInt(45)+1;
    	  
    	  // 중복되는 수가 있는지 없는지 판단하는 반복문
    	  for(int j = 0 ; j< i ; j++) {
    		  if(lotto[i] == lotto[j]) {
    			  i--;
    			  break;
    		  }
    	  }
      }
	
	// 확인을 위한 for문 사용
    for(int i =0 ; i<lotto.length ; i++) {
    	System.out.println("행운의 숫자: "+lotto[i]);
    }	
	
	
	
	
	
	
	
	
	}

}

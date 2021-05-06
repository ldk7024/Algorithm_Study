
public class ex03 {

	public static void main(String[] args) {
		// 0 -> 0~4
		// 1 -> 1~3
		// 2 -> 2
		// 3 -> 1~3
		// 4 -> 0~4
		int array[][] = new int [5][5];
		char ch = 'A';
		
		// 5행 5열 배열 만들기
		// i -> 행을 위해 만듬
		/// j -> 열을 위해 만듬
		for(int i=0 ; i<=4 ; i++) {
			// [0,*], [1,*]일 때
           if (i<2) {
        	   // 0 -> 4-0 =4, 4-1 =3, 4-2 =2, 4-3 =1, 4-4=0
        	   // 1-> 1 -> 4-1 =3, 4-2-2 , 4-3 =1
        	   for(int j = i; j<=4-i ; j++) {
        		   array[i][j] = ch++;
        	   }
           }else if(i==2) {
        	   array[2][2] = ch++;
        	   
           }// [3.*], [4,*] 일때
           else {
        	   for(int j = 4-i ; j<=i; j++) {
        		   array[i][j] = ch++;
        	   }
           }
		}
		// 모래시계 출력
        for (int i =0 ; i<=4 ; i++) {
        	for(int j = 0 ; j<=4; j++) {
        		System.out.print((char)array[i][j] + "  ");
        	}
        	 System.out.println();
        }
	   
	}

}

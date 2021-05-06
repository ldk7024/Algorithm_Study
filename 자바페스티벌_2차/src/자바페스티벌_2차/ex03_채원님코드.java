package 자바페스티벌_2차;

import java.util.Scanner;

public class ex03_채원님코드 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      System.out.print("N입력>> ");
	      int N = scan.nextInt();
	      int[][] B= new int[N][N];
	      int num = 1;
	      for(int i=0; i<B.length; i++) {
	         for(int j=0; j<B.length; j++) {
	            B[i][j] = num;
	            System.out.print(B[i][j]+"\t");
	            num++;
	         }
	         System.out.println();
	      }
	}

}

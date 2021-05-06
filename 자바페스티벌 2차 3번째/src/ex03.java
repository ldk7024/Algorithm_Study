import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("NÀÔ·Â: ");
    int n = sc.nextInt();
    int[][]array = new int[n][n];
    int a =1;
    for(int i =0; i<array.length;i++) {
    	for(int j =0; j<array.length;j++) {
    		array[i][j]=a;
    		System.out.print(array[i][j]+"\t");
    		a++;
    	}
    System.out.println();
    }

	}

}

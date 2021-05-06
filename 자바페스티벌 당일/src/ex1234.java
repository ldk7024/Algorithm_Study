import java.util.Scanner;

public class ex1234 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("소인수분해 할 수 입력하세요. :");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println(num/2);
		}

	}

}

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요: ");
		int weekhour = sc.nextInt();
		if (weekhour<8) {
			System.out.println("총 임금은"+weekhour*5000);
		}
		else {
			System.out.println("총임금은: "+ (int)((5000*1.5)*(weekhour-8)+(5000*8)));
		}
	}

}

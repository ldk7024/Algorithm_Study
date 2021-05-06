import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요: ");
		int workhour = sc.nextInt();
		if(workhour<8) {
			System.out.println("총 임금은"+(5000*workhour)+"원 입니다.");		
			}
		else {
			System.out.println("총 임금은"+(int)(5000*1.5)*(workhour-8)+(5000*8)+"원 입니다.");
		}

	}

}

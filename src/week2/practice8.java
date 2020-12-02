package week2;
//입력값이 0~100 사이 값만 출력
import java.util.Scanner;
public class practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int a;
		System.out.print("정수입력: ");
		a = input.nextInt();
		if(a<0 || a>100) {
			System.out.printf("입력오류!!");
		}
		else {
			System.out.printf("입력된값 : %d", a);
		}
	}

}

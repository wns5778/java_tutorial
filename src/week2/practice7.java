package week2;
//입력받은 두 수중 큰 수 출력
import java.util.Scanner;
public class practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		System.out.print("a :");
		a = input.nextInt();
		System.out.print("b: ");
		b = input.nextInt();
		
		System.out.println(a > b ? a : b);

	}

}

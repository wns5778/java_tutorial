package week2;
//�Է°��� 0~100 ���� ���� ���
import java.util.Scanner;
public class practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int a;
		System.out.print("�����Է�: ");
		a = input.nextInt();
		if(a<0 || a>100) {
			System.out.printf("�Է¿���!!");
		}
		else {
			System.out.printf("�ԷµȰ� : %d", a);
		}
	}

}

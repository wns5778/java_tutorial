package week2;
//�ﰢ�� ���� ���ϱ�
import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int base;
		int height;
		double width;
		System.out.println("**** �ﰢ���� ���� ���ϱ� ****");
		System.out.print("�غ�: ");
		base = input.nextInt();
		System.out.print("����: ");
		height = input.nextInt();
		
		width = (double)base * height / 2;
		System.out.printf("����: %.2f", width);
			
	}

}

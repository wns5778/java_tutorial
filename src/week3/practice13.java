package week3;

import java.util.Scanner;
public class practice13 {//����/��� ���ϱ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("�⵵ �Է� : ");
		year = sc.nextInt();
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			//���� ���� -> 4�� ������ ���������ϸ� 100���� ����������� �ȵǰ� 400���� ������ ����������
			System.out.println("����");
		}
		else {
			System.out.println("���");
		}
		
	}

}

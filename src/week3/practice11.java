package week3;

import java.util.Scanner;
public class practice11 {//2���� ���ڿ� �����ڸ� �Է��Ͽ� ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int A, B;
		char C;
		double D;
		
		System.out.print("A���� �Է��Ͻÿ�:");
		A = input.nextInt();
		System.out.print("B���� �Է��Ͻÿ�:");
		B = input.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/):");
		C = input.next().charAt(0);
		
		if(C == '+') {
			System.out.printf(A +"+" + B + "=%d",A+B);
		}
		else if(C == '-') {
			System.out.printf(A +"-" + B + "=%d",A-B);
		}
		
		else if(C == '*') {
			System.out.printf(A +"*" + B + "=%d", A*B);
		}
		else if(C =='/') {
			System.out.printf(A +"/" + B + "= %.2f", (float)A/B);//�Ҽ��� 2��°�ڸ����� ������ ǥ��
		}
		else {
			System.out.println("������ error");//�ٸ� �����ڰ� ������ errorǥ��
		}

	}

}

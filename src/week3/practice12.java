package week3;

import java.util.Scanner;
public class practice12 {//����ó�����α׷�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int midterm, finals, report, attend;
		double result;
		char grade;
		
		System.out.print("�߰���� ������ �Է��Ͻÿ�:");
		midterm = input.nextInt();
		System.out.print("�⸻��� ������ �Է��Ͻÿ�:");
		finals = input.nextInt();
		System.out.print("����Ʈ ������ �Է��Ͻÿ�:");
		report = input.nextInt();
		System.out.print("�⼮ ������ �Է��Ͻÿ�:");
		attend = input.nextInt();
		
		System.out.println("�߰���� : "+midterm);
		System.out.println("�⸻��� : "+finals);
		System.out.println("����Ʈ : "+report);
		System.out.println("�⼮ : "+attend);
		
		result = (midterm + finals)/2*0.6 + 0.2*report + 0.2*attend;
		//���� = (�߰�+�⸻)/2 -> 60%, ����Ʈ -> 20%, �⼮ -> 20%
		System.out.printf("���� = %.2f\n",result);
		if(result >= 90) {
			grade = 'A';
			System.out.println("���� = A");
		}
		else if(result >= 80) {
			grade = 'B';
			System.out.println("���� = B");
		}
		else if(result >= 70) {
			grade = 'C';
			System.out.println("���� = C");
		}
		else if(result >= 60) {
			grade = 'D';
			System.out.println("���� = D");
		}
		else {
			grade = 'F';
			System.out.println("���� = F");
		}
		switch(grade) {
		case 'A':
			System.out.println("�� : excellent");
			break;
		case 'B':
			System.out.println("�� : excellent");
			break;
		case 'C':
			System.out.println("�� : good");
			break;
		case 'D':
			System.out.println("�� : good");
			break;
		case 'F':
			System.out.println("�� : poor");
			break;
			
		}

	}

}

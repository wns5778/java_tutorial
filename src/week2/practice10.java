package week2;
//���׿����ڸ� ����� �Է�ó�� M �̸� ���� F�� ����

import java.util.Scanner;
public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name;
		char gender;
		int age;
		double tall;
		
		System.out.print("input name:");
		name = input.nextLine();
		System.out.print("input gender(���ڸ� M ���ڸ� F):");
		gender = input.next().charAt(0);
		System.out.print("input age:");
		age = input.nextInt();
		System.out.print("input tall:");
		tall = input.nextDouble();
		
		
		System.out.println("�̸� : "+name);
		if(gender == 'M') {
			System.out.println("���� : ����");
		}
		else if(gender == 'F') {
			System.out.println("���� : ����");
		}
		else {
			System.out.println("���� : �˼�����");
		}
		System.out.println("���� : "+age);
		System.out.printf("���� : %.1f", tall);
	
	}

}

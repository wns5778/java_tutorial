package week2;
//��ҹ��� ���� ����
import java.util.Scanner;
import java.io.IOException;
public class practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		char alphabet;
		System.out.print("Input Character:");
		alphabet = input.next().charAt(0);//���� �Է¹ޱ�
		
		
		if(alphabet >= 'A' && alphabet<='Z') {
			System.out.println("result: " + (char)(alphabet+32));			
		}//�빮���� ��� 32�� ���� �ҹ��ڷ� �����Ѵ�.
		
		else if(alphabet>='a' && alphabet<='z') {
			System.out.println("result: " + (char)(alphabet-32));
		}//�ҹ����� ��쿡�� 32�� �� �빮�ڷ� �������ش�. 
		
		else {
			System.out.println("�Է¿���!");
		}
	}

}

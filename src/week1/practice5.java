package week1;
import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String name;
		int kor;
		int eng;
		int mat;
		int sum;
		double avg;
		
		System.out.print("�̸� :");
		name = input.nextLine();
		System.out.print("kor :");
		kor = input.nextInt();
		System.out.print("eng :");
		eng = input.nextInt();
		System.out.print("mat :");
		mat = input.nextInt();
		
		sum = kor + eng + mat;
		avg = (double)sum/3;
		System.out.println("�̸�= " + name);
		System.out.println("�հ�= " + sum +"��");
		System.out.printf("���=%.1f ", avg);



	}

}

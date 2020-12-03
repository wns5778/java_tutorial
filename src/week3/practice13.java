package week3;

import java.util.Scanner;
public class practice13 {//윤년/평년 구하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			//윤년 조건 -> 4로 나누어 떨어져야하며 100으로 나누어떨어지면 안되고 400으로 나누어 떨어져야함
			System.out.println("윤년");
		}
		else {
			System.out.println("평년");
		}
		
	}

}

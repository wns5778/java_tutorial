package week3;

import java.util.Scanner;
public class practice11 {//2개의 숫자와 연산자를 입력하여 계산

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int A, B;
		char C;
		double D;
		
		System.out.print("A값을 입력하시오:");
		A = input.nextInt();
		System.out.print("B값을 입력하시오:");
		B = input.nextInt();
		System.out.print("연산자를 입력(+,-,*,/):");
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
			System.out.printf(A +"/" + B + "= %.2f", (float)A/B);//소수점 2번째자리까지 나오게 표현
		}
		else {
			System.out.println("연산자 error");//다른 연산자가 나오면 error표시
		}

	}

}

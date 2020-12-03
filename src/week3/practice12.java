package week3;

import java.util.Scanner;
public class practice12 {//성적처리프로그램

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int midterm, finals, report, attend;
		double result;
		char grade;
		
		System.out.print("중간고사 점수를 입력하시오:");
		midterm = input.nextInt();
		System.out.print("기말고사 점수를 입력하시오:");
		finals = input.nextInt();
		System.out.print("레포트 점수를 입력하시오:");
		report = input.nextInt();
		System.out.print("출석 점수를 입력하시오:");
		attend = input.nextInt();
		
		System.out.println("중간고사 : "+midterm);
		System.out.println("기말고사 : "+finals);
		System.out.println("레포트 : "+report);
		System.out.println("출석 : "+attend);
		
		result = (midterm + finals)/2*0.6 + 0.2*report + 0.2*attend;
		//성적 = (중간+기말)/2 -> 60%, 레포트 -> 20%, 출석 -> 20%
		System.out.printf("성적 = %.2f\n",result);
		if(result >= 90) {
			grade = 'A';
			System.out.println("학점 = A");
		}
		else if(result >= 80) {
			grade = 'B';
			System.out.println("학점 = B");
		}
		else if(result >= 70) {
			grade = 'C';
			System.out.println("학점 = C");
		}
		else if(result >= 60) {
			grade = 'D';
			System.out.println("학점 = D");
		}
		else {
			grade = 'F';
			System.out.println("학점 = F");
		}
		switch(grade) {
		case 'A':
			System.out.println("평가 : excellent");
			break;
		case 'B':
			System.out.println("평가 : excellent");
			break;
		case 'C':
			System.out.println("평가 : good");
			break;
		case 'D':
			System.out.println("평가 : good");
			break;
		case 'F':
			System.out.println("평가 : poor");
			break;
			
		}

	}

}

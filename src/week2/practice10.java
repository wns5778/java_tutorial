package week2;
//삼항연산자를 사용한 입력처리 M 이면 남자 F면 여자

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
		System.out.print("input gender(여자면 M 남자면 F):");
		gender = input.next().charAt(0);
		System.out.print("input age:");
		age = input.nextInt();
		System.out.print("input tall:");
		tall = input.nextDouble();
		
		
		System.out.println("이름 : "+name);
		if(gender == 'M') {
			System.out.println("성별 : 남자");
		}
		else if(gender == 'F') {
			System.out.println("성별 : 여자");
		}
		else {
			System.out.println("성별 : 알수없음");
		}
		System.out.println("나이 : "+age);
		System.out.printf("신장 : %.1f", tall);
	
	}

}

package week2;
//대소문자 변경 문제
import java.util.Scanner;
import java.io.IOException;
public class practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		char alphabet;
		System.out.print("Input Character:");
		alphabet = input.next().charAt(0);//문자 입력받기
		
		
		if(alphabet >= 'A' && alphabet<='Z') {
			System.out.println("result: " + (char)(alphabet+32));			
		}//대문자일 경우 32를 더해 소문자로 변경한다.
		
		else if(alphabet>='a' && alphabet<='z') {
			System.out.println("result: " + (char)(alphabet-32));
		}//소문자일 경우에는 32를 빼 대문자로 변경해준다. 
		
		else {
			System.out.println("입력오류!");
		}
	}

}

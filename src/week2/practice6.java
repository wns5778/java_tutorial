package week2;
//ªÔ∞¢«¸ ≥–¿Ã ±∏«œ±‚
import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int base;
		int height;
		double width;
		System.out.println("**** ªÔ∞¢«¸¿« ≥–¿Ã ±∏«œ±‚ ****");
		System.out.print("πÿ∫Ø: ");
		base = input.nextInt();
		System.out.print("≥Ù¿Ã: ");
		height = input.nextInt();
		
		width = (double)base * height / 2;
		System.out.printf("≥–¿Ã: %.2f", width);
			
	}

}

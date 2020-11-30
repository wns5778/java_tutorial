package week1;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 65430;
		int tenthousand = 10000;
		int thousand = 1000;
		int hundred = 100;
		int ten = 10;
		
		System.out.println("µ· = " + money);
		System.out.println("¸¸¿øÀÇ °¹¼ö = " + money/tenthousand);
		System.out.println("Ãµ¿øÀÇ °¹¼ö = " + (money - 60000)/thousand);
		System.out.println("¹é¿øÀÇ °¹¼ö = " + (money - 65000)/hundred);
		System.out.println("½Ê¿øÀÇ °¹¼ö = " + (money - 65400)/ten);

	}

}

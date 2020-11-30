package week1;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basicpay = 1500000;
		int pay = 55000;
		int tex = basicpay/10;
		int netpay;
		
		netpay = basicpay + pay - tex;
		System.out.println("실수령액 = "+ netpay +"원");

	}

}

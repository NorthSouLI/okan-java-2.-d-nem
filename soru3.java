package �dev;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		
		
		int k,h,a,�;
		System.out.println("1 Kenar uzunlu�unu giriniz :");
		k=giris.nextInt();
		
		a=6*(k*k);
		h=k*k*k;
		�=k*12;
		
		System.out.println("Alan :"+a+
				"\nHacim :"+h+
				"\n�evre :"+�);
		
		
	}

}

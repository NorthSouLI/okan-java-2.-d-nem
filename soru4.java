package �dev;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		
		int r,h;
		double �,a,hacim;
		
		System.out.println("Yar��ap de�erini giriniz :");
		r=giris.nextInt();
		System.out.println("Y�ksekli�i giriniz :");
		h=giris.nextInt();
		
		a=2*Math.PI*r*(r+h);
		hacim=Math.PI*(r*r)*h;
		System.out.println("Alan :"+a+
				"\nHacim"+hacim);
	}

}

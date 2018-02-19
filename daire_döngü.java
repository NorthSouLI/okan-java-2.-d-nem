package allahsenialsın;

import java.util.Scanner;

public class daire_döngü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		byte r,sayac;
		double alan,çevre;
		for(sayac=1;sayac<=3;sayac++) {
			
		System.out.println("Yarı çap değerini giriniz");
		r=giris.nextByte();
		alan=Math.PI*r*r;
		çevre=2*Math.PI*r;
		System.out.println("Çevre :"+çevre+
			"\nAlan :"+alan);
		
		}		
		
	}

}

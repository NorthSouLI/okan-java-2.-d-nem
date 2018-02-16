package ödev;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		
		
		double m,km,hm,dam,f,dm,cm,mm;
		
		System.out.println("Metre Deðerini giriniz :");
		m=giris.nextDouble();
		dam=m/10;
		hm=m/100;
		km=m/1000;
		dm=m*10;
		cm=m*100;
		mm=m*1000;
		
		
		System.out.println("Kilometre"+km+
				"\nHektometre"+hm+
				"\nDesimetre"+dam+
				"\nDekametre"+dm+
				"\nSantimetre"+cm+
				"\nMilimetre"+mm);
		
		
	}

}

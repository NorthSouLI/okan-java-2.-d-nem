package dizi_method;

import java.util.Scanner;

public class method_örnek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		yaziYaz();	
		System.out.println("Bir isim giriniz");
		String ad=giris.next();
		selamVer(ad);
		System.out.println("Yaşınızı giriniz");
		int yas=giris.nextInt();
		int dt=yasHesap(yas);
		System.out.println("Doğum tarihiniz: "+dt);
	}
	private static void yaziYaz() {
		//System.out.println("Parametresiz geri dönüşsüz metot");
		
	}
	private static void selamVer(String ad) {
		//System.out.println("/nGelen parametreli metot");
		System.out.println("Merhaba: "+ad);
		
	}
	private static int yasHesap(int yas) {
		//System.out.println("Parametreli geri dönüşlü metot");
		
		return (2018-yas);
	}
}

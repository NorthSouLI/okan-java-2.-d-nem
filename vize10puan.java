package sınav_öncesi;

import java.util.Scanner;

public class vize10puan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		System.out.println("Kaç kişi gireceksiniz");
		int ks=giris.nextInt();
		int ss;
		int çözüm[]=new int [ks];
		for (int i=0;i<ks;i++) {
		System.out.println("İsminizi giriniz: ");
		String ad=giris.next();
		System.out.println("Cinsiyetinizi giriniz: ");
		String cinsiyet=giris.next();
		System.out.println("Vize notunu giriniz: ");
		int vize=giris.nextInt();
		System.out.println("Final notunu giriniz: ");
		int finall=giris.nextInt();
		double bn=vize*0.4+finall*0.6;
	}
		for(;;) {		
			menuYap();
			int menu=giris.nextInt();
			switch (menu) {	
			case 1: Listeleme(çözüm);
				break;
			case 2: isimİleArama(çözüm, args, null, null, menu, menu, menu);
				break;
			case 3: vizeFinalBaşarıOrt(çözüm);
				break;
			case 4: başarıNotuBüyüklerinBilgisi(çözüm);
				break;
			case 5: enKüçükBaşarıNotuBilgisi (çözüm);
				break;
			case 6: enKüçükBaşarıNotuBilgisi (çözüm);
				break;
			case 7: Çıkış(çözüm);
			System.exit(0);
				break;
			default:
			System.out.println("Yanlış Seçim");
		}
		
	}
}

	private static void Çıkış(int[] çözüm) {
		// TODO Auto-generated method stub
		
	}

	private static void enKüçükBaşarıNotuBilgisi(int[] çözüm) {
		// TODO Auto-generated method stub
		
	}

	private static void başarıNotuBüyüklerinBilgisi(int[] çözüm) {
		// TODO Auto-generated method stub
		
	}

	private static void vizeFinalBaşarıOrt(int[] çözüm) {
		// TODO Auto-generated method stub
		System.out.println("Vize notu ort"vize/ks);
	}

	private static void isimİleArama(int[] çözüm, String ad[],String arananAd,String cinsiyet, int vize,int finall,double bn ) {
		// TODO Auto-generated method stub
		for (byte i=0;i<ad.length;i++) {
			 if(arananAd.equalsIgnoreCase(ad[i]));
			System.out.println("\n "+i+" Kisinin Bilgileri");
			System.out.println("Kisinin adi :" + ad[i]);
			System.out.println("Kisinin cinsiyeti :" + cinsiyet);
			System.out.println("Kişinin vize notu"+vize);	
			System.out.println("Kişinin final notu"+finall);
			System.out.println("Kişinin başarı notu"+vize*0.4+finall*0.6);
		}
	}

	private static void Listeleme(int[] çözüm) {
		// TODO Auto-generated method stub
		
	}

	private static void menuYap() {
		// TODO Auto-generated method stub
		System.out.println("1-Listeleme\n2-İsimİleArama\n3-VizeFinalBaşarınotuOrt\4-BaşarıNotuOrtBüyüklerinBilgisi"
				+ "\n5-EnKüçükBaşarıNotuBilgisi\n6-EnBüyükBaşarıNotuBilgisi\n7-Çıkış");
	}
}
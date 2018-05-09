package arda;

import java.util.Scanner;

public class final_hazýrlýk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		int i,yastop=0,erkeksayi=0,yasort=0;
		System.out.println("Kaç kiþi gireceksiniz: ");
		int ks=giris.nextInt();
		String ad[]=new String [ks];
		String cinsiyet[]=new String [ks];
		String meslek[]=new String [ks];
		int yas[]=new int [ks];
		int maas[]=new int [ks];
		for(i=0;i<ks;i++) {
			System.out.println("Adýnýzý giriniz: ");
			ad [i]=giris.next();
			System.out.println("Cinsiyetinizi giriniz: ");
			cinsiyet[i]=giris.next();
			System.out.println("Yaþýnýzý giriniz: ");
			yas[i]=giris.nextInt();
			System.out.println("Mesleðinizi giriniz: ");
			meslek [i]=giris.next();
			System.out.println("Maaþýnýzý giriniz: ");
			maas [i]=giris.nextInt();
		
		}
		for (;;) {
			menuYap();
			int menu=giris.nextInt();
			switch (menu) {
			case 1:Listeleme(ad,yas,maas,meslek,cinsiyet,ks);
				break;
			case 2:ÖðretmenlerinBilgileri(meslek,ad,yas,maas,ks,cinsiyet);
				break;
			case 3:
				System.out.println("Aradýðýnýz isimi giriniz: ");
				String arananad=giris.next();
				ÝsimÝleArama(ad,yas,cinsiyet,maas,ks,arananad,meslek);
				break;
			case 4:
				YaþOrtalamalarý(yastop,ks,yas,yasort);
				break;
			case 5:ErkeklerinYasOrtalamasý(cinsiyet,yastop,ad,maas,yas,ks,erkeksayi);
			erkeksayi++;
			yastop+=yas[i];
				break;
			case 6:Çýkýþ();
			System.exit(0);
				break;
				default:
					System.out.println("Yanlýþ Seçim: ");
			}
		}
	}

	private static void menuYap() {
		// TODO Auto-generated method stub
		System.out.println("Seçiminizi yapýnýz: \n"
				+ "1-Listeleme\n2-ÖðretmenlerinBilgisi\n3-ÝsimÝleArama\n4-YaþOrtalamalarý\n5-ErkeklerinYaþOrtalamasý\n6-Çýkýþ");
	}

	private static void Listeleme(String[] ad, int[] yas, int[] maas, String[] meslek, String[] cinsiyet, int ks) {
		// TODO Auto-generated method stub
		for(int i=0;i<ks;i++) {
			System.out.println(ad[i]+"\t"+cinsiyet[i]+"\t"+yas[i]+"\t"+maas[i]+"\t"+meslek[i]);
		}
	}

	private static void ÖðretmenlerinBilgileri(String[] meslek, String[] ad, int[] yas, int[] maas, int ks, String[] cinsiyet) {
		// TODO Auto-generated method stub
		for(int i=0;i<ks;i++) {
			if(meslek[i]=="öðretmen") {
				System.out.println("Öðretmenlerin Bilgileri: ");
				System.out.println("Adý:"+ad[i]);
				System.out.println("Cinsiyeti: "+cinsiyet[i]);
				System.out.println("Yaþý: "+yas[i]);
				System.out.println("Mesleði: "+meslek[i]);
				System.out.println("Maaþý: "+maas[i]);
		}
	}
		
	}
	private static void ÝsimÝleArama(String[] ad, int[] yas, String[] cinsiyet, int[] maas, int ks, String arananad,
			String[] meslek) {
		for(int i=0;i<ks;i++) {
			if(arananad.equalsIgnoreCase(ad[i])) {	
				System.out.println("Kiþinin Bilgileri: ");
				System.out.println("Adý: "+ad[i]);
				System.out.println("Cinsiyeti: "+cinsiyet[i]);
				System.out.println("Yaþý: "+yas[i]);
				System.out.println("Mesleði: "+meslek[i]);
				System.out.println("Maaþý: "+maas[i]);
		}
			
	}
		
	}
	private static void YaþOrtalamalarý(int yastop, int ks,int[] yas, int yasort) {
		// TODO Auto-generated method stub
		for(int i=0;i<ks;i++) {
			yastop+=yas[i];
		}
		System.out.println("Yaþ Ortalamasý: "+yastop/ks);
	}

	private static void ErkeklerinYasOrtalamasý(String[] cinsiyet, int yastop, String[] ad,int[] yas,
			int[] maas, int ks, int erkeksayi) {
		// TODO Auto-generated method stub
		for(int i=0;i<ks;i++) {
			if(cinsiyet[i]=="erkek") {
				
				
			}
			System.out.println("Erkeklerin Yaþ Ortalamasý: "+yastop/erkeksayi);
		}
	}

	private static void Çýkýþ() {
		// TODO Auto-generated method stub
		
	}

}

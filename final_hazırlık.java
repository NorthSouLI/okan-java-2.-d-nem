package arda;

import java.util.Scanner;

public class final_haz�rl�k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		int i,yastop=0,erkeksayi=0,yasort=0;
		System.out.println("Ka� ki�i gireceksiniz: ");
		int ks=giris.nextInt();
		String ad[]=new String [ks];
		String cinsiyet[]=new String [ks];
		String meslek[]=new String [ks];
		int yas[]=new int [ks];
		int maas[]=new int [ks];
		for(i=0;i<ks;i++) {
			System.out.println("Ad�n�z� giriniz: ");
			ad [i]=giris.next();
			System.out.println("Cinsiyetinizi giriniz: ");
			cinsiyet[i]=giris.next();
			System.out.println("Ya��n�z� giriniz: ");
			yas[i]=giris.nextInt();
			System.out.println("Mesle�inizi giriniz: ");
			meslek [i]=giris.next();
			System.out.println("Maa��n�z� giriniz: ");
			maas [i]=giris.nextInt();
		
		}
		for (;;) {
			menuYap();
			int menu=giris.nextInt();
			switch (menu) {
			case 1:Listeleme(ad,yas,maas,meslek,cinsiyet,ks);
				break;
			case 2:��retmenlerinBilgileri(meslek,ad,yas,maas,ks,cinsiyet);
				break;
			case 3:
				System.out.println("Arad���n�z isimi giriniz: ");
				String arananad=giris.next();
				�sim�leArama(ad,yas,cinsiyet,maas,ks,arananad,meslek);
				break;
			case 4:
				Ya�Ortalamalar�(yastop,ks,yas,yasort);
				break;
			case 5:ErkeklerinYasOrtalamas�(cinsiyet,yastop,ad,maas,yas,ks,erkeksayi);
			erkeksayi++;
			yastop+=yas[i];
				break;
			case 6:��k��();
			System.exit(0);
				break;
				default:
					System.out.println("Yanl�� Se�im: ");
			}
		}
	}

	private static void menuYap() {
		// TODO Auto-generated method stub
		System.out.println("Se�iminizi yap�n�z: \n"
				+ "1-Listeleme\n2-��retmenlerinBilgisi\n3-�sim�leArama\n4-Ya�Ortalamalar�\n5-ErkeklerinYa�Ortalamas�\n6-��k��");
	}

	private static void Listeleme(String[] ad, int[] yas, int[] maas, String[] meslek, String[] cinsiyet, int ks) {
		// TODO Auto-generated method stub
		for(int i=0;i<ks;i++) {
			System.out.println(ad[i]+"\t"+cinsiyet[i]+"\t"+yas[i]+"\t"+maas[i]+"\t"+meslek[i]);
		}
	}

	private static void ��retmenlerinBilgileri(String[] meslek, String[] ad, int[] yas, int[] maas, int ks, String[] cinsiyet) {
		// TODO Auto-generated method stub
		for(int i=0;i<ks;i++) {
			if(meslek[i]=="��retmen") {
				System.out.println("��retmenlerin Bilgileri: ");
				System.out.println("Ad�:"+ad[i]);
				System.out.println("Cinsiyeti: "+cinsiyet[i]);
				System.out.println("Ya��: "+yas[i]);
				System.out.println("Mesle�i: "+meslek[i]);
				System.out.println("Maa��: "+maas[i]);
		}
	}
		
	}
	private static void �sim�leArama(String[] ad, int[] yas, String[] cinsiyet, int[] maas, int ks, String arananad,
			String[] meslek) {
		for(int i=0;i<ks;i++) {
			if(arananad.equalsIgnoreCase(ad[i])) {	
				System.out.println("Ki�inin Bilgileri: ");
				System.out.println("Ad�: "+ad[i]);
				System.out.println("Cinsiyeti: "+cinsiyet[i]);
				System.out.println("Ya��: "+yas[i]);
				System.out.println("Mesle�i: "+meslek[i]);
				System.out.println("Maa��: "+maas[i]);
		}
			
	}
		
	}
	private static void Ya�Ortalamalar�(int yastop, int ks,int[] yas, int yasort) {
		// TODO Auto-generated method stub
		for(int i=0;i<ks;i++) {
			yastop+=yas[i];
		}
		System.out.println("Ya� Ortalamas�: "+yastop/ks);
	}

	private static void ErkeklerinYasOrtalamas�(String[] cinsiyet, int yastop, String[] ad,int[] yas,
			int[] maas, int ks, int erkeksayi) {
		// TODO Auto-generated method stub
		for(int i=0;i<ks;i++) {
			if(cinsiyet[i]=="erkek") {
				
				
			}
			System.out.println("Erkeklerin Ya� Ortalamas�: "+yastop/erkeksayi);
		}
	}

	private static void ��k��() {
		// TODO Auto-generated method stub
		
	}

}

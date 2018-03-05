package dizi_method;

import java.util.Scanner;

public class metot_soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		System.out.println("Kaç veri gireceksiniz");
		int ss=giris.nextInt();
		//Dizi tanımı
		int sayi[]=new int[ss];
		for (int i=0;i<ss;i++) {
			System.out.print(i+"inci sayıyı giriniz");
			sayi[i]=giris.nextInt();
		}
		//sonsuz döngü ile menü tanımı
		for(;;) {
			menuYaz();
			int menu=giris.nextInt();
			switch(menu) {
			case 1: ortalama(sayi);
				break;
			case 2: tekort(sayi);
				break;
			case 3: ciftort(sayi);
				break;
			case 4: enKüçük(sayi);
				break;
			case 5: enBüyük(sayi);
				break;
			case 6: Çıkış(sayi);
			System.exit(0);
				break;
				default:
				System.out.println("Yanlış Seçim");
			}
		}
	}

	private static void Çıkış(int[] sayi) {
		
		
	}

	private static void enBüyük(int[] sayi) {
		int eb=sayi[0];
		for(int i=0;i<sayi.length;i++) {
			
		if (sayi[i]>eb) eb=sayi[i];
	}
		System.out.println("En büyük sayı: "+eb);
		
	}

	private static void enKüçük(int[] sayi) {
		int ek=sayi[0];
		for(int i=0;i<sayi.length;i++) {
			
		if (sayi[i]<ek) ek=sayi[i];
	}
		System.out.println("En küçük sayı: "+ek);
	}
	private static void ciftort(int[] sayi) {
		int cifttopla=0,ciftsayi=0;
		for(int i=0;i<sayi.length;i++) {
			if(sayi[i]%2==0) {
				cifttopla+=sayi[i];
				ciftsayi++;
			}
	}
		System.out.println("Çiftlerin ortalaması: "+(cifttopla/ciftsayi));
	}
	private static void menuYaz() {
		System.out.println("1-Ortalama\n2-Teklerin Ort\n3-Çiftlerin Ort"
				+ "\n4-En Küçük\n5-En Büyük\n6-Çıkış \nSeçiminiz");
	}
	private static void ortalama(int[] sayi) {
		int toplam=0,ts=0;
		for(int i=0;i<sayi.length;i++) {
			toplam+=sayi[i];
			ts++;
		}
		System.out.println("Tüm sayıların ortalaması: "+toplam/sayi.length);	
	}
	private static void tekort(int[] sayi) {
		int tektopla=0,teksayi=0;
		for(int i=0;i<sayi.length;i++) {
		if
		(sayi[i]%2==1) {
				tektopla+=sayi[i];
				teksayi++;	
	}
		
}
		System.out.println("Teklerin ortalaması: "+(tektopla/teksayi));
	}
}

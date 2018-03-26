package arda;

import java.util.Scanner;

public class diziler_tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner (System.in);
		int sayi[]=new int [5];
		int i,toplam=0,ort,os=0;
		
		/*System.out.println("Birinci sayi");
		sayi[0]=giris.nextInt();
		System.out.println("ikinnci sayi");
		sayi[1]=giris.nextInt();
		System.out.println("Üçüncü sayi");
		sayi[2]=giris.nextInt();
		System.out.println("Dördüncü sayi");
		sayi[3]=giris.nextInt();
		System.out.println("Beşinci sayi");
		sayi[4]=giris.nextInt();
		*/
		for (i=0;i<sayi.length;i++) {
		System.out.println("Sayıyı giriniz");	
			sayi[i]=giris.nextInt();
		}
		System.out.println("Sayılarınız");
		for(i=0;i<sayi.length;i++) {
			System.out.println(i+" inci sayı: "+sayi[i]);
		}
		for (i=0;i<sayi.length;i++){
			toplam+=sayi[i];		
		}
		System.out.println("5 sayının toplamı: "+toplam);
		ort=toplam/5;
		System.out.println("5 Sayının ortalaması: "+ort);
		for(i=0;i<sayi.length;i++) {
			if (sayi[i]>ort) {os++;
				System.out.println("Ortalamadan büyük sayılar: "+sayi[i]);
			}
			
			
		}
	}

	
}

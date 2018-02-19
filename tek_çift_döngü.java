package allahsenialsın;

import java.util.Scanner;

public class tek_çift_döngü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner (System.in);
		int tt =0,çt = 0,sayi,toplam =0,ts =0,çs =0;
		byte s;
		System.out.println("Kaç sayı gireceksiniz ?");
		byte limit=giris.nextByte();
		for(s=0;s<limit;s++) {
			System.out.println("Sayı Değerini giriniz :");
			sayi=giris.nextInt();
			toplam+=sayi;
			if(sayi % 2 == 0){
		       çt+=sayi;
		       çs++;
			} else{
		       tt+=sayi;
		       ts++;
		    
		
		
		
		
		
			}
			System.out.println("Tüm Sayıların toplamı :"+toplam);
			System.out.println("Çift Sayıların toplamı :"+çt);
			System.out.println("Tek Sayıların toplamı :"+tt);
			System.out.println("Tüm sayıların ortalaması :"+toplam/limit);
			System.out.println("Çift sayıların ortalaması :"+tt/çs);
			System.out.println("Tek sayıların ortalaması :"+çt/ts);
	}
			
	}
}

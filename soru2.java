package �dev2;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		byte limit,say�,psay� =0,nsay�=0,pkisi=0,nkisi=0,port=0,nort=0;
		
		System.out.println("Limit de�erini giriniz :");
		limit=giris.nextByte();
		byte i;
		
		for (i=0;i<limit;i++) {
		System.out.println("Bir say� giriniz :");	
		say�=giris.nextByte();
		
		if (say�<0){
			nkisi++;
			nsay�+=say�;
			nort=(byte) (nsay�/nkisi);
		} else {
			pkisi++;
			psay�+=say�;
			port=(byte) (psay�/pkisi);
		}		
		}
		System.out.println("Pozitif say�lar�n toplam� :"+psay�);
		System.out.println("Pozitif say�lar�n adedi :"+pkisi);
		System.out.println("Pozitif say�lar�n ortalamas� :"+port);
		System.out.println("Negatif say�lar�n toplam� :"+nsay�);
		System.out.println("Negatif say�lar�n adedi :"+nkisi);
		System.out.println("Negatif say�lar�n ortalamas� :"+nort);
		
	}
}

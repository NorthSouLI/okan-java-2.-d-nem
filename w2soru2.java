package ödev2;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		byte limit,sayı,psayı =0,nsayı=0,pkisi=0,nkisi=0,port=0,nort=0;
		
		System.out.println("Limit değerini giriniz :");
		limit=giris.nextByte();
		byte i;
		
		for (i=0;i<limit;i++) {
		System.out.println("Bir sayı giriniz :");	
		sayı=giris.nextByte();
		
		if (sayı<0){
			nkisi++;
			nsayı+=sayı;
			nort=(byte) (nsayı/nkisi);
		} else {
			pkisi++;
			psayı+=sayı;
			port=(byte) (psayı/pkisi);
		}		
		}
		System.out.println("Pozitif sayıların toplamı :"+psayı);
		System.out.println("Pozitif sayıların adedi :"+pkisi);
		System.out.println("Pozitif sayıların ortalaması :"+port);
		System.out.println("Negatif sayıların toplamı :"+nsayı);
		System.out.println("Negatif sayıların adedi :"+nkisi);
		System.out.println("Negatif sayıların ortalaması :"+nort);
		
	}
}

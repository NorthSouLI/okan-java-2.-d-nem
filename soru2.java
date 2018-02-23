package ödev2;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		byte limit,sayý,psayý =0,nsayý=0,pkisi=0,nkisi=0,port=0,nort=0;
		
		System.out.println("Limit deðerini giriniz :");
		limit=giris.nextByte();
		byte i;
		
		for (i=0;i<limit;i++) {
		System.out.println("Bir sayý giriniz :");	
		sayý=giris.nextByte();
		
		if (sayý<0){
			nkisi++;
			nsayý+=sayý;
			nort=(byte) (nsayý/nkisi);
		} else {
			pkisi++;
			psayý+=sayý;
			port=(byte) (psayý/pkisi);
		}		
		}
		System.out.println("Pozitif sayýlarýn toplamý :"+psayý);
		System.out.println("Pozitif sayýlarýn adedi :"+pkisi);
		System.out.println("Pozitif sayýlarýn ortalamasý :"+port);
		System.out.println("Negatif sayýlarýn toplamý :"+nsayý);
		System.out.println("Negatif sayýlarýn adedi :"+nkisi);
		System.out.println("Negatif sayýlarýn ortalamasý :"+nort);
		
	}
}

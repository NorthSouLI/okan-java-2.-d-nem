package allahsenialsın;

import java.util.Scanner;

public class vize_final_for_döngüsü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		
		byte sayac,fn,vn,bn =0;
		short vnt = 0;
		short fnt = 0;
		short bnt = 0;
		for (sayac=0;sayac<5;sayac++) {
		System.out.println("Vize Notunu giriniz :");
		vn=giris.nextByte();
		System.out.println("Final Notunu giriniz :");
		fn=giris.nextByte();
		bn = (byte) (vn*0.4+fn*0.6);
		System.out.println("Başarın Notu Toplamı :"+bnt);
		bnt= (short) (bnt+bn);
		System.out.println("Vize Notu toplamı :"+vnt);
		vnt=(short) (vnt+vn);
		System.out.println("Final Notu toplamı :"+fnt);
		fnt=(short) (fnt+fn);
		//döngü bitişi
		
		
		
		}
		System.out.println("Vize Notu Ortalaması :"+(vnt/5));
		System.out.println("Final Notu Ortalaması :"+(fnt/5));
		System.out.println("Sınıf Başarı Ortalaması :"+(bnt/5));
	}

}

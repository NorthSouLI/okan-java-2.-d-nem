package �dev2;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner giris=new Scanner(System.in);
		
		int V,F,bn,sayac,say�;
		byte bnt = 0,vt = 0,ft=0,limit;
		byte ffs=0,dds=0,dcs=0,ccs=0,cbs=0,bbs=0,bas=0,aas=0;
		byte ff=1,dd=1,dc=1,cc=1,cb=1,bb=1,ba=1,aa=1;
		byte fft=0,ddt=0,dct=0,cct=0,cbt=0,bbt=0,bat=0,aat=0;
		byte ffo=0,ddo=0,dco=0,cco=0,cbo=0,bbo=0,bao=0,aao=0;
		System.out.println("Limit de�erini giriniz");
		limit=giris.nextByte();
		for (sayac=1;sayac<=limit;sayac++) {
			System.out.println("Vize notunu giriniz = ");
			V=giris.nextInt();
			System.out.println("Final notunu giriniz = ");
			F=giris.nextInt();
			bn=(((V*4)/10)+((F*6)/10));
			
			if (bn<30) {
				System.out.println("Ba�ar� notu = FF");
				ffs++;
				fft+=bn;
				ffo=(byte) (bn/ffs);
			} else if (bn<40) {
				System.out.println("Ba�ar� notu = DD");
				dds++;
				ddt+=bn;
				ddo=(byte) (bn/dds);
			} else if (bn<50) { 
				System.out.println("Ba�ar� notu = DC");
				dcs++;
				dct+=bn;
				dco=(byte) (bn/dcs);
			} else if (bn<60) {
				System.out.println("Ba�ar� notu = CC");
				ccs++;
				cct+=bn;
				cco=(byte) (bn/ccs);
			} else if (bn<70) {
				System.out.println("Ba�ar� notu = CB");
				cbs++;
				cbt+=bn;
				cbo=(byte) (bn/cbs);
			} else if (bn<80) {
				System.out.println("Ba�ar� notu = BB");
				bbs++;
				bbt+=bn;
				bbo=(byte) (bn/bbs);
			} else if (bn<90) {
				System.out.println("Ba�ar� notu = BA");
				bas++;
				bat+=bn;
				bao=(byte) (bn/bas);
			} else {
			System.out.println("Ba�ar�notu = AA");
				aas++;
				aat+=bn;
				aao=(byte) (bn/aas);
			vt=(byte) (vt+V);
			ft=(byte) (ft+F);
			bnt=(byte) (bnt+bn);
		}
	}
		System.out.println("s�n�f vize  ortalamas� = "+vt/5);
		System.out.println("s�n�f final ortalamas� = "+ft/5);
		System.out.println("s�n�f genel ortalamas� = "+bnt/5);
		System.out.println("FF lerin say�s� :"+ffs);
		System.out.println("FF lerin ortalamas� :"+ffo);
		System.out.println("DD lerin say�s� :"+dds);
		System.out.println("DD lerin ortalamas� :"+ddo);
		System.out.println("DC lerin say�s� :"+dcs);
		System.out.println("DC lerin ortalamas� :"+dco);
		System.out.println("CC lerin say�s� :"+ccs);
		System.out.println("CC lerin ortalamas� :"+cco);
		System.out.println("CB lerin say�s� :"+cbs);
		System.out.println("CB lerin ortalamas� :"+cbo);
		System.out.println("BB lerin say�s� :"+bbs);
		System.out.println("BB lerin ortalamas� :"+bbo);
		System.out.println("BA lar�n say�s� :"+bas);
		System.out.println("BA lar�n ortalamas� :"+bao);
		System.out.println("AA lar�n say�s� :"+aas);
		System.out.println("AA lar�n ortalamas� :"+aao);
		
		
	}

}

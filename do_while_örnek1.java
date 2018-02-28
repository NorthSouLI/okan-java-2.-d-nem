import java.util.Scanner;

public class do_while_örnek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		byte i,limit;
		int sayi=0,toplam=0,t=0,c=0,ct=0,tt=0,tümort=0,cort=0,tort=0;
		System.out.println("Kaç kişi gireceksiniz: ");
		limit=giris.nextByte();
		
		for(i=1;i<=limit;i++) {
		System.out.println("Sayı değerini giriniz: ");
			sayi=giris.nextInt();
			toplam+=sayi;
			tümort=toplam/limit;
		}if (i%2==0) {
			ct+=sayi;
			c++;
			cort=ct/c;
		}else {
			tt+=sayi;
			t++;
			tort=tt/t;
				
		}
		System.out.println("Tek sayıların toplamı: "+tt);
		System.out.println("Tek sayıların ortalaması: "+tort);
		System.out.println("Çift sayıların toplamı: "+ct);
		System.out.println("Çift sayıların ortalaması: "+cort);
		System.out.println("Tüm sayıların toplamı: "+toplam);
		System.out.println("Tüm sayıların ortalaması: "+tümort);
		
	}
	}


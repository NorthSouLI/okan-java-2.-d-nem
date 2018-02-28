import java.util.Scanner;

public class tek_cift_do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner (System.in);
		System.out.println("Kaç sayı gireceksiniz: ");
		byte ks=giris.nextByte();
		int i,toplam=0,ts=0,ttoplam=0,cs=0,ctoplam=0,sayi;
		/*for(i=1;i<=ks;i++) {
		System.out.println(i+" inci sayıyı giriniz");
		sayi=giris.nextInt();
		toplam+=sayi;
		if(sayi%2==0) {
			cs++;	
			ctoplam+=sayi;
		} else {
			ts++;
			ttoplam+=sayi;
			
			
			
		}
	}*/
		i=1;
		do {
			System.out.println(i+" inci sayıyı giriniz");
			sayi=giris.nextInt();
			toplam+=sayi;
			if(sayi%2==0) {
				cs++;	
				ctoplam+=sayi;
			} else {
				ts++;
				ttoplam+=sayi;
			}
			i++;
		} while (i<=ks);
		System.out.println("Tüm sayıların ortalaması: "+(toplam/ks));
		System.out.println("Teklerin ortalaması: "+(ttoplam/ts));
		System.out.println("Çiftlerin ortalaması: "+(ctoplam/cs));
}
}


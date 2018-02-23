package ödev2;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
        int yas,buyukyas =0,buyukyasort=0,kýrkustuort=0,kýrkaltýort=0,kucukyasort=0,kucukyas =0,maas,limit,maasort=0,yasort=0,yastoplam=0,maastoplam=0;
        System.out.print("Kac kisi giriceksiniz =");
        limit=giris.nextInt();
        Byte s;
        for (s=0;s<limit;s++){   
        
        System.out.println("Yasinizi giriniz");
        yas=giris.nextInt();
        System.out.println("Maasinizi giriniz");
        maas=giris.nextInt();
		yastoplam+=yas;
		maastoplam+=maas;
		yasort =yastoplam/limit;
		maasort =maastoplam/limit;
		if (yas<=39){
		 kucukyas+=yas;  
		 kucukyasort=kucukyas/yas;
		 kýrkaltýort=kucukyas/kucukyasort;
		 } else {
		 
		 buyukyas+=yas;
		 buyukyasort=buyukyas/yas;
		 kýrkustuort=buyukyas/buyukyasort;
 	}
 	}
 	System.out.println("Yas ortalamasi :"+yasort);
 	System.out.println("Maas ortalamasi :"+maasort);
 	System.out.println("Yas toplami :"+yastoplam);
 	System.out.println("Maas toplami :"+maastoplam);
 	System.out.println("40 yas ustu toplamý :"+buyukyas);
 	System.out.println("40 yas altý toplamý :"+kucukyas);
 	System.out.println("40 yas ustu kisi sayisi :"+buyukyasort);
 	System.out.println("40 yas altý kisi sayisi :"+kucukyasort);
 	System.out.println("40 yas altý ortalama :"+kýrkaltýort);
 	System.out.println("40 yas ustu ortalama :"+kýrkustuort);
	}

}

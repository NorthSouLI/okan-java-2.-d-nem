package ödev;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris=new Scanner(System.in);
		
		
		int k,h,a,ç;
		System.out.println("1 Kenar uzunluðunu giriniz :");
		k=giris.nextInt();
		
		a=6*(k*k);
		h=k*k*k;
		ç=k*12;
		
		System.out.println("Alan :"+a+
				"\nHacim :"+h+
				"\nÇevre :"+ç);
		
		
	}

}

package ödev;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris= new Scanner(System.in);
		
		
		double f,t,y,u,a, b , c , d, e;
		
		System.out.println("A değerini giriniz :");
		a= giris.nextDouble();
		System.out.println("B değerini giriniz :");
		b= giris.nextDouble();
		System.out.println("C değerini giriniz :");
		c= giris.nextDouble();
		System.out.println("D değerini giriniz :");
		d= giris.nextDouble();
		System.out.println("E değerini giriniz :");
		e= giris.nextDouble();
		
		
		t=((a+(b*c))/(d*e));
		y=(a/c)*b;
		u=(((a*b)*(a*b))/(c+d));
		f=t+y+u;
		System.out.println("F ="+f);
	}

}

package �dev;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris= new Scanner(System.in);
		
		int a, b , c , d, e;
		double f,t,y,u;
		
		System.out.println("A de�erini giriniz :");
		a= giris.nextInt();
		System.out.println("B de�erini giriniz :");
		b= giris.nextInt();
		System.out.println("C de�erini giriniz :");
		c= giris.nextInt();
		System.out.println("D de�erini giriniz :");
		d= giris.nextInt();
		System.out.println("E de�erini giriniz :");
		e= giris.nextInt();
		
		
		t=((a+(b*c))/(d*e));
		y=(a/c)*b;
		u=(((a*b)*(a*b))/(c+d));
		f=t+y+u;
		System.out.println("F ="+f);
	}

}

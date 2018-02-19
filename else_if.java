package allahsenialsın;
import java.util.Scanner;
public class else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giris = new Scanner(System.in);
		double vn, fn, bn;
		System.out.println("Vize notunu giriniz");
		vn = giris.nextDouble();
		System.out.println("Final notunu giriniz");
		fn = giris.nextDouble();
		bn = vn * 0.4 + fn * 0.6;

		if (bn < 29) {
			System.out.println("Sonucun FF");
		} else if (bn < 39) {
			System.out.println("Sonucun DD");
		} else if (bn < 49) {
			System.out.println("Sonucun DC");
		} else if (bn < 59) {
			System.out.println("Sonucun CC");
		} else if (bn < 69) {
			System.out.println("Sonucun CB");
		} else if (bn < 79) {
			System.out.println("Sonucun BB");
		} else if (bn < 89) {
			System.out.println("Sonucun BA");
		} else if (bn < 99) {
			System.out.println("Sonucun AA");

		}
	}

}

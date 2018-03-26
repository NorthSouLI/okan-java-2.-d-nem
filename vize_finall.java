package arda;

import java.util.Scanner;

public class vize_finall {
	public static void main(String[] args) {
		
		Scanner giris=new Scanner(System.in);
		int ks,toplam=0,fntop=0,vntop=0,bnort=0,bnt=0,vo,fo;
		System.out.println("Kaç kişi gireceksiniz: ");
		int i=giris.nextInt();
		byte vize []=new byte [i];
		byte finall []=new byte [i];
		byte bn []=new byte [i];
		for (ks=0;ks<i;ks++) {
			System.out.println("Vize notunu giriniz: ");
			vize [ks]=giris.nextByte();
			System.out.println("Final notunu giriniz: ");
			finall[ks]=giris.nextByte();
			bn[ks]=(byte) (vize[ks]*0.4+finall[ks]*0.6);
		}
		for (ks=0;ks<i;ks++) {
			vntop+=vize[ks];
			fntop+=finall[ks];
			bnt+=bn[ks];
		}
		vo=vntop/ks;
		fo=fntop/ks;
		bnort=bnt/ks;
		System.out.println("Başarı notu ortalaması: "+bnort);
		System.out.println("Vize notu ortalaması: "+vo);
		System.out.println("Final notu ortalaması: "+fo);
		byte vneb=vize[0],vnek=vize[0],fneb=finall[0],fnek=finall[0],bneb=bn[0],bnek=bn[0];
		for(ks=1;ks<i;ks++) {
			if (vize[i]<vnek) vnek=vize[i];
			if (finall[i]<fnek) fnek=finall[i];
			if (bn[i]<bnek) bnek=bn[i];
		}
		System.out.println("En küçük vize notu: "+vnek);
		System.out.println("En küçük finall notu: "+fnek);
		System.out.println("En küçük başarı notu: "+bnek);
		for(ks=1;ks<i;ks++) {
			if (vize[i]<vneb) vneb=vize[i];
			if (finall[i]<fneb) fneb=finall[i];
			if (bn[i]<bneb) bneb=bn[i];
		}
		System.out.println("En büyük vize notu: "+vneb);
		System.out.println("En büyük final notu: "+fneb);
		System.out.println("En büyük başarı notu: "+bneb);
}
}
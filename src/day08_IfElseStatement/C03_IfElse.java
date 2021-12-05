package day08_IfElseStatement;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		//  Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”, 
		//65’den buyukse “Emekli olabilirsin” yazdirin

	
		Scanner scan= new Scanner (System .in );
		
		System.out.println(" lutfen yasinizi giriniz");
	
	int yas= scan.nextInt();
	
	if (yas<65) {System.out.println("EMEKLI OLAMAZSIN ,CALISMALISIN");
		
	} else {System.out.println("EMEKLI OLABILIRSIN");

	}
	
	
	
	}

}

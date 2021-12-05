package day08_IfElseStatement;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		//  Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
        // eger uc kenar uzunlugu birbirine esit ise ekrana "Eskenar ucgen"
        //diger durumlarda ekrana "Eskenar ucgen degil" yazdir

	
            Scanner scan= new Scanner (System .in );
		
		System.out.println(" lutfen ucgenin bir kener uzunlugunu giriniz");
	
	double kenar1=scan.nextDouble();
	double kenar2=scan.nextDouble();
	double kenar3=scan.nextDouble();
	
	if (kenar1==kenar2 && kenar2==kenar3) { System.out.println("eskenar ucgen");
		
	} else {System.out.println("Eskenar ucgen degil");

	}
	
	
	
	
	}

}

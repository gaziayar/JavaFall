

package day07_IfStatements;

import java.util.Scanner;

public class C04_BaitIfCumleleri {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu  giriniz");
	
	double kenar1= scan.nextDouble();
	
	System.out.println("Lutfen dikdortgenin diger kenar uzunlugunu  giriniz");
	
	double kenar2= scan.nextDouble();
	
	if (kenar1==kenar2) {System.out.println("girilen dikdortgen kare");
	
	
	}
	
	if (kenar1!=kenar2) {System.out.println("girilen dikdortgen kare degil");
		
	}
	
	
	
	
	
	
	}

}

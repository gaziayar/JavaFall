package day05;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		

	
	// kullanicidan 3 basamakli bir sayi alip 
		// rakamlar toplamini yazdiran 
		// bir program yaziniz
		Scanner scan= new Scanner(System.in);
	
	System.out.println("lutfen uc basamakli bir sayi giriniz");
	
	int sayi= scan.nextInt();
	
	// sayi 573 olsun

	int rakamlarToplami=0;
	
  int rakam= sayi%10;
	
	rakamlarToplami+=rakam;
	sayi/=10;
	
	rakam=sayi%10;
	
	
	rakamlarToplami+=rakam;
	
	
	sayi/=10;
	
	
	rakamlarToplami+=sayi;
	System.out.println("girdiginiz sayinin rakamlar toplami:"+rakamlarToplami);
	
	
	
	
	
	}


}

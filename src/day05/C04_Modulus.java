package day05;

import java.util.Scanner;

public interface C04_Modulus {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen dort basamakli bir sayi giriniz");
		
		int sayi= scan.nextInt();
		
		// sayi 573 olsun

		int rakamlarToplami=0;
		
	  int rakam= sayi%10;	
		rakamlarToplami+=rakam;
		sayi/=10;
		
		
		rakam= sayi%10;	
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam= sayi%10;	
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam= sayi%10;	
		rakamlarToplami+=rakam;
		sayi/=10;
		
		System.out.println("girdiginiz sayinin rakamlar toplami:"+rakamlarToplami);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

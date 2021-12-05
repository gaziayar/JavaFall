package day05;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen alti basamakli bir sayi giriniz");
		
		int sayi= scan.nextInt();
	
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
	
		rakam= sayi%10;	
		rakamlarToplami+=rakam;
		sayi/=10;
	
		rakam= sayi%10;	
		rakamlarToplami+=rakam;
		sayi/=10;
		System.out.println("girdiginiz sayinin rakamlar toplami:"+rakamlarToplami);
		
		
	
	
	}

}

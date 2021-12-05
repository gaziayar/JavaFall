package day08_IfElseStatement;

import java.util.Scanner;

public class C02_IfElse {
public static void main(String[] args) {
	
	Scanner scan= new Scanner (System .in );
	
	System.out.println(" lutfen bir karakter giriniz");
	
	char karakter=scan.next().charAt(0);
	
	if (karakter>='a'&& karakter<='z'  || karakter>='A'&& karakter <='Z') 
	{System.out.println("Girdiginiz:"+ karakter + " bir haftir");
		
	} else {System.out.println("Girdiginiz:" + karakter + " bir harf degil");

	}
	
	
	
	
}
}

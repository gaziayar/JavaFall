package day06_wrapper;

public class CO1_WrapperClass {

	public static void main(String[] args) {
		
  int sayi=10;
	
	Integer sayi2=20;
	
	String tel1="3578987";
			String tel2="3245434";
	
	System.out.println(tel1+tel2);
	
	
	System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
	
	System.out.println(Integer.MIN_VALUE);
	
	System.out.println(Integer.MAX_VALUE);
	
	System.out.println(Double.MAX_VALUE);
	System.out.println(Short.MAX_VALUE);
	
	String caddeNo="203";// harf oldugunda kod calismaz 

	String sokakNo="1564";
	System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
	
	
	
	}

}

package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C01_LocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate tarih = LocalDate.now();

		System.out.println(tarih);

		System.out.println(tarih.getDayOfYear());

		System.out.println(tarih.getDayOfMonth());

		System.out.println(tarih.getDayOfWeek());

		System.out.println(tarih.getMonthValue());

		System.out.println(tarih.getMonth());
        System.out.println(tarih.plusDays(20));
		
		System.out.println(tarih.plusMonths(5));
		
		System.out.println(tarih.plusWeeks(15));
		System.out.println(tarih.plusYears(4));
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10));
		System.out.println(tarih.minusDays(20));
	
		System.out.println(tarih.minusWeeks(20));
		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5));
		System.out.println(tarih.minusYears(21).isLeapYear());
		
		LocalDate dogumTarihi1=LocalDate .of(1988,02, 12);
		LocalDate dogumTarihi2=LocalDate .of(1999,02, 12);
		LocalDate dogumTarihi3=LocalDate .of(1985,10, 12);
		System.out.println(dogumTarihi1+","+dogumTarihi2);
		System.out.println(dogumTarihi1.isAfter(dogumTarihi2));
		System.out.println(dogumTarihi3.isBefore(dogumTarihi1));
		
		
	}

}

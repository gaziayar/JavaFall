package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		//

		List<String> isimler = new ArrayList<>();
		System.out.println("bos liste: " + isimler);
		isimler.add("Ali");

		System.out.println("bir eleman:" + isimler);

		isimler.add("Veli");

		System.out.println("iki eleman:" + isimler);

		isimler.add("Can");

		System.out.println("uc eleman:" + isimler);

		isimler.add(1, "Ayse");

		System.out.println("1. indexe Ayse eklendi:" + isimler);

//isimler.add(5);declare ederken belirtigimiz bir data turunden ekleme yapamayiz

		List<String> liste2 = new ArrayList<>();

		liste2.add("Gazi");

		liste2.add("Esra");

		System.out.println("liste 2:" + liste2);

		isimler.addAll(4, liste2);

		System.out.println("Sona liste 2 yi ekledik:" + isimler);

		isimler.addAll(liste2);

		System.out.println("index olmadan   liste 2 yi tekrar ekledik:" + isimler);

	}

}

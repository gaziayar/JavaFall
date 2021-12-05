package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArrayAsList {

	public static void main(String[] args) {
		// verilen arrayi arrays clasindan yardim alarak lise cevirin

		String arr[] = { "A", "B", "C", "d" };

		List<String> arraydenList = Arrays.asList(arr);

		System.out.println(arraydenList);

//	arraydenList.add("G"); RTE verir
//	System.out.println(arraydenList);

	arr[1]="Z";
	
	System.out.println("Arrayi degistirdikten sonra ,array:" + Arrays.toString(arr));
	
	
	arraydenList.set(3,"D");
	
	
	System.out.println("listi degistirdikten sonra ,list:" + arraydenList);
	System.out.println("listi degistirdikten sonra ,arrey:" + Arrays.toString(arr));
	
	
	}

}

package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_LIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	List<String> str=new ArrayList<>();
	str.add("Jeyhun");
	
	str.add("Yildiz");
	str.add("Mustafa");
	str.add("Tugba");
	str.add("Turgat");
	
	
	System.out.println(str);
	
	
	String silinecekharf="a";
	
	killThemAll(str,silinecekharf);
	
	
	
	
	
	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekharf)) {
				str.remove(i);
			i--;
			
			}
		}
		
		System.out.println(str);
		return str;
	}

}

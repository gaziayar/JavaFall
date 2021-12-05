package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]= {3,4,5,6,3,5};
	
	int silinecekEleman=6;
	
	List <Integer>gecici=new ArrayList<>();
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=silinecekEleman)
	gecici.add(arr[i]);
	}
	System.out.println("list olarak: " + gecici);
	}
	
	
	
	
	
	
	}



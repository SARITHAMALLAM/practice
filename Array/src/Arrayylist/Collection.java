package Arrayylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		
		int firstIndex = 2;
		int secondIndex =3;
		
		List<String> list = new ArrayList<>();
		list.add("string0");
		list.add("string1");
		list.add("string2");
		list.add("string3");
		list.add("string4");
		list.add("string5");
		list.add("string6");

		String temp = list.get(firstIndex);
		
		list.set(firstIndex, list.get(secondIndex));
		
		list.set(secondIndex, temp);
				
		

		Collections.swap(list, firstIndex, secondIndex);
		

		System.out.println(list);
	}
	
}	
	


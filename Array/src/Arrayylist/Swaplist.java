package Arrayylist;



 	import java.util.ArrayList;
	import java.util.List;

	public class Swaplist {

		public static void main(String[] args) {
			
			int firstIndex = 4;
			int secondIndex = 5;
			
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
			
//removing a list
			
			// list.remove(list.size()-1);
			
			
								
						

			System.out.println(list);
		}
		
	}


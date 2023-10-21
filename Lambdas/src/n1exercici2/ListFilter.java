package n1exercici2;

import java.util.ArrayList;
import java.util.List;

public class ListFilter {
	
	
	public static void main(String[] args) {

	
	List<String> list1 = new ArrayList<String>();
	
	list1.add("tapioca");
	list1.add("soja");
	list1.add("rockefeller");
	list1.add("aceituna");
	list1.add("arroz");
	list1.add("mairena");

	
	filter(list1).forEach(str -> System.out.println(str));
	
	}

	public static List<String> filter(List<String> list1) {
			
		List<String> list2 = new ArrayList<String>();
		
		list1.forEach(str -> {
			if(str.toLowerCase().contains("o") && str.length() > 5) 
				list2.add(str);
			});

		return list2;
	}

}
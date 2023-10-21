package n2exercici1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		
		List<String> names = new ArrayList<String>();
		
		names.add("Ana");
		names.add("Pou");
		names.add("ana");
		names.add("Alba");
		names.add("Aa");
		names.add("Aa");
		names.add("Javi");
		names.add("Charlotte");
		names.add("Ala");
		names.add("Ata");
		names.add("ANA");
		names.add("aan");

		
		
		NameFilter e = (l)-> {
			
			List<String> namesFilter = new ArrayList<String>();
			
			l.forEach(str -> {
				if(Character.toString(str.charAt(0)).equals("A") && str.length() == 3) 
					namesFilter.add(str);
				});
			
			return namesFilter;
		};
		
		
		
		e.filterList(names).forEach(System.out::println);
	}

}
package n1exercici6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderedList {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
		list.add("abcdz");
		list.add("abcde");
		list.add("abcd");
		list.add(123);
		list.add(12);
		list.add(1);
		list.add("abc");
		list.add("ab");
		list.add("a");
		list.add(2);
		list.add("zw");
		list.add("sdasfsafs");
		
		//System.out.println(list.get(0) instanceof String);
		//System.out.println(list.get(3) instanceof String);
		
		Collections.sort(list, (o1, o2) ->{
		    if (o1 instanceof String && o2 instanceof String) {
		        String s1 = (String) o1;
		        String s2 = (String) o2;
		        return Integer.compare(s1.length(), s2.length());
		    } else if (o1 instanceof String) {
		        return 1; 
		    } else if (o2 instanceof String) {
		        return -1; 
		    } else {
		        return 0;
		    }
		});
		
		list.forEach(System.out::println);
	}

}

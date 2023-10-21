package n2exercici4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
	
	
	public static void main(String[] args) {
	
		List<Object> strIntList = new ArrayList<Object>();
		
		strIntList.add("si");
		strIntList.add(32);
		strIntList.add("nuno");
		strIntList.add(999);
		strIntList.add("javi");
		strIntList.add("pablo");
		strIntList.add("macarrones");
		strIntList.add(432);
		strIntList.add(111);
		strIntList.add("eso");
		strIntList.add("eloy");
		strIntList.add(12);
		strIntList.add("no");
		strIntList.add("gerard");
		strIntList.add("esto");
		strIntList.add(40);
		strIntList.add("45");
		strIntList.add("500");
		
		System.out.println("llista ordenada alfabèticament pel primer caràcter:\n");
		orderedByFirstChar(strIntList).forEach(System.out::println);
		
		System.out.println("\nprimer les strings que contenen una 'e':\n");
		containsE(strIntList).forEach(System.out::println);
		
		System.out.println("\na = 4\n");
		replaceA(strIntList).forEach(System.out::println);
		
		System.out.println("\nmostrar elements numerics (encara que estiguin guardats com strings)\n");
		showNums(strIntList);
	}
	
	
	
	
	public static List<Object> orderedByFirstChar(List<Object> strIntList) {

		Collections.sort(strIntList, (o1, o2) -> {
			return o1.toString().charAt(0) - o2.toString().charAt(0);}
		);
		return strIntList;
		
	}
	
	public static List<Object> containsE(List<Object> strIntList) {
		
		Collections.sort(strIntList, (o1, o2) -> {
			 if (o1 instanceof String && ((String) o1).toLowerCase().contains("e")) {  
				return -1;     
			}else if(!(o2 instanceof String)){
				return -1;
			}else {
				return 0;
			}});
		
		return strIntList;
	}
	
	
	public static List<Object> replaceA(List<Object> strIntList){
		
		strIntList.forEach(o ->{
			if(o instanceof String) {
				String str = (String) strIntList.get(strIntList.indexOf((String)o));
				str = str.replace("a", "4");
				strIntList.set(strIntList.indexOf(o), str);
			}
		});
		
		return strIntList;
	}
	
	public static void showNums(List<Object> strIntList){
		
		strIntList.forEach(o ->{
			if(o instanceof String){
				  try {
			            Integer.parseInt((String) o);
			            System.out.println(o);
			        } catch (NumberFormatException excepcion) {       
			        }
			}else {
				System.out.println(o);
			}
			
		});
		
	}
}

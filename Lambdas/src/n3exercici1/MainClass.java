package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		List<Student> stdList = new ArrayList<Student>();
		List<Student> aFilter = new ArrayList<Student>();
		
		stdList.add(new Student("alba",20,"java",1));
		stdList.add(new Student("joan",16,"php",5));
		stdList.add(new Student("lluc",12,"java",6));
		stdList.add(new Student("gerard",15,"php",9));
		stdList.add(new Student("roger",15,"java",2));
		stdList.add(new Student("nil",12,"php",5));
		stdList.add(new Student("charlotte",14,"java",6));
		stdList.add(new Student("ana",44,"php",8));
		stdList.add(new Student("paula",13,"java",1.2f));
		stdList.add(new Student("andrea",13,"php	",4.9f));
		
		
		/*stdList.forEach(std -> {
			std.showNameAge();
		});*/
		/*AFilter f = (l) ->{
			stdList.forEach(std -> {
				std.filter(aFilter);
			});	
		};
		
		f.filter(stdList);*/

		stdList.forEach(std -> {
			std.filter(aFilter);
		});
		
		aFilter.forEach(std -> {
			std.showNameAge();
		});
	}
	
}

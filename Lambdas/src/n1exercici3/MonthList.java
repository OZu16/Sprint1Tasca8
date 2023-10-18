package n1exercici3;

import java.util.ArrayList;
import java.util.List;

public class MonthList {

	public static void main(String[] args) {
		
		List<String> monthList = new ArrayList<String>();
		
		monthList.add("gener");
		monthList.add("febrer");
		monthList.add("març");
		monthList.add("abril");
		monthList.add("maig");
		monthList.add("juny");
		monthList.add("juliol");
		monthList.add("agost");
		monthList.add("septembre");
		monthList.add("octubre");
		monthList.add("novembre");
		monthList.add("desembre");
		
		monthList.forEach(month -> System.out.println(month));


		
		
	}
}

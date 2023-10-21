package n2exercici2;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(11);
		nums.add(28);
		nums.add(30);
		nums.add(46);
		nums.add(58);
		nums.add(61);
		nums.add(72);
		nums.add(83);
		nums.add(92);
		nums.add(10);
		
		
		
		IntsToString e = (k)->{
			
			StringBuilder ints = new StringBuilder();
			
			k.forEach( num ->{
				if(num%2 == 0) {
					ints.append("e"+ num + ", ");
				}else {
					ints.append("o" + num + ", ");
				}
			});
			
			ints.deleteCharAt(ints.length() - 2);
			
			return ints.toString();
		};
		
		System.out.println(e.listToString(nums));
	}

}

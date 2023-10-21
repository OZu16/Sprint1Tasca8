package n2exercici3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sc {
	
	static Scanner sc = new Scanner(System.in);
	

			
	public static float readFloat(String missatgeFloat) {
		
		float floatUser = 0f;
		boolean invalidEntryUser = false;

		
		do {
			
			try{
				
				System.out.println(missatgeFloat);
				floatUser = sc.nextFloat();
				invalidEntryUser = false;
				
			}catch(InputMismatchException  e) {
				System.out.println("error de format (torna a introduir les dades)");
				invalidEntryUser = true;
				
			}
			
			sc.nextLine();
			
		}while(invalidEntryUser);	
			
		return floatUser;	
	}
	

	
	public static char readChar(String messageChar) {
		
		char charUser = ' ';
		String entryUser = "";
		boolean invalidEntryUser = true;
		
		do {
			
			System.out.println(messageChar);
			entryUser = sc.nextLine();
			
			if(entryUser.length() == 1 && (entryUser.equals("*") || entryUser.equals("+") || entryUser.equals("-") || entryUser.equals("/"))) {	
				charUser = entryUser.charAt(0);
				invalidEntryUser = false;
			}else {
				try {
					throw new Exception("error de format(torna a introduir les dades)");
				
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
	
			
		}while(invalidEntryUser);
		
	        return charUser;
	}
	


}

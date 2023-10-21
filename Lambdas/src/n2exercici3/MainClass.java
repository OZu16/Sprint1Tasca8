package n2exercici3;

import java.util.Scanner;

public class MainClass {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception{
		
		String str1 = "num 1";
		float num1 = 0f;
		String str2 = "num 2";
		float num2 = 0f;
		String str3 = "operacio (+ , - , / , *)";
		char op = ' ';
		
		num1 = Sc.readFloat(str1);
		num2 = Sc.readFloat(str2);
		op = Sc.readChar(str3);
		
		
			
		Maths e = (a, b, s) ->{
			
			float result = 0f;
			
			switch(s) {
				case '+':
					result = a+b;
					break;
				case '-':
					result = a-b;
					break;
				case '*':
					result = a*b;
					break;
				case '/':
					if(b != 0) {
					result = a/b;
					}else {
						throw new Exception("error(no es posible dividir entre '0')");
					}
					break;	
			}

			return result;
		};
		
		try {
			System.out.println(num1 + " " + op + " " + num2 + " = " + e.operation(num1, num2, op));
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
	}

}

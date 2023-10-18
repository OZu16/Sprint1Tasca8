package n1exercici8;

public class MainClass {

	public static void main(String[] args) {

		
		String word = "otorrinolaringologo";
		
		ReverseWords reverseStr = (String str) -> {
			
			String reverseWord = "";
			
			for (int i = word.length() -1; i >= 0; --i) {
				reverseWord += word.charAt(i);
			}
			return reverseWord;
		};
		
		System.out.println(reverseStr.reverse(word));
	}

}

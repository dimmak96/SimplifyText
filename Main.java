import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.print("Enter text: ");
		String text = scn.nextLine();
		text = text.replace("ci", "si").replace("ce", "se").replace("ck", "k").replace('c', 'k');
		text = text.replace("ee", "i").replace("oo", "u");
		text = text.replaceAll( "(.)\\1{1,}", "$1" );
		String[] words = text.split("[\\s,.!?&]+");
		
		
		
		for (int i = 0; i < words.length; i++){
			
			if (words[i].equals("the") || words[i].equals("a") || words[i].equals("an")) words[i] = "";
			
			if (words[i].length() > 1 && words[i].endsWith("e")) words[i] = words[i].replace("e", "");
			
		}
		//success  sucsess suksess sukses
		System.out.println();
		System.out.print("Result: ");
		for (int i = 0; i < words.length; i++){
			System.out.print(words[i] + " ");
		}
		
		
	}

	
	
	
}

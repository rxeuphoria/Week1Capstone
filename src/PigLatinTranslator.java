import java.util.Scanner;
import java.lang.*;

public class PigLatinTranslator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
			String running = "y";
			do {
		System.out.println("Please enter a word to be translated.");
		String phrase = scnr.next();
			phrase = phrase.toLowerCase();
	        StringBuilder pigLatin = new StringBuilder(phrase);
	        int len = pigLatin.length();
	        
	    
	    for (int i  = 0; i < len; i++) {
	    if ((pigLatin.charAt(0) == 'a') || (pigLatin.charAt(0) == 'e') || (pigLatin.charAt(0) == 'i') || (pigLatin.charAt(0) == 'o') || (pigLatin.charAt(0) == 'u'))  {
	    	pigLatin.append("way");
	    	break;
	    } else if ((pigLatin.charAt(i) == 'a') || (pigLatin.charAt(i) == 'e') || (pigLatin.charAt(i) == 'i') || (pigLatin.charAt(i) == 'o') || (pigLatin.charAt(i) == 'u')) {
	    	String prefix = pigLatin.substring(0, (i));
	    	pigLatin.delete(0, (i));
	    	pigLatin.append(prefix + "ay");
	    	break;
	    }
	    }
	    System.out.println(pigLatin);
	  System.out.println("Would you like to translate another? (y/n)");
	  running = scnr.next();
} while (running.toLowerCase().charAt(0) == 'y');
	}
}

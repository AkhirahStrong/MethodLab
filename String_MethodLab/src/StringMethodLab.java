
public class StringMethodLab {
	
	/*
	 *capitalize(String word) - takes a word and prints it out with 
	 *the first letter capitalized and all other letters lowercase.
       E.g. for “blAZes”, it prints “Blazes”.
 
	 * */
	
public static String capitalize(String word) {
		
		String output = "";
		
		if (word.length() > 1) {
			output += Character.toUpperCase(word.charAt(0));
			output += word.substring(1).toLowerCase();
		}else {
			output = word.toUpperCase();
		}
		return output;
	}
	
     /*
      * wheresWaldo(String phrase) - takes a string and prints the location (index) 
      * in the string where the word “Waldo” first appears.
		E.g. for “Striped Waldo!”, it prints “8”.
      * */
	
	public static String wheresWaldo(String waldo) {
		
		String whereIs = "waldo";
		
		int  indexW = waldo.indexOf(whereIs);
		String indexAll = Integer.toString(indexW);
		
		return indexAll;
		
	}	
	
	
	/*
	 * firstThingsFirst(String a, String b) - takes two strings, prints the string that comes first alphabetically, then prints the other.
        *E.g. for “cat” and “dog”, it prints: “cat dog”; for “tree” and “pine”, it prints: “pine tree”.

	 * */
	
	public static String firstThingsFirst(String a, String b)	{
		
			if(a.compareToIgnoreCase(b) <= 0) {
				return a;
			} else {
				return b;
			}
     	}
	
	/*
	 * reverse(String s) - takes a string and prints it backwards
        E.g. for “happy”, it prints “yppah”.

	 * 
	 * */
	
	public static String reverse(String s) {
		String output = "";
		for (int i = s.length()-1; i >= 0; i--) {
			output += s.charAt(i);
		}
		return output;
	}
	
	/*
	 * 
	 * soLong(String a, String b) - prints only the longer of the two strings. If both strings are the same length, print both.
        E.g. for “bean” and “pea”, it prints “bean”; for “tart” and “trap”, it prints “tart trap”

	 * 
	 * */
	
	public static void soLong(String a, String b) {
		
		if (a.length() == b.length()) {
			System.out.println(a + " " + b);
		} else if (a.length() > b.length()) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
		/*if(a.length() > b.length()) {
			return a;
		} else if(a.length() < b.length()) {
			return b; 
		}else if(a.length() == b.length()) {
			System.out.print(a + b);
		    
		} */
		
		
	}
	
	
	/*
	 * afterMath(String phrase) - takes a phrase. If the phrase contains the word math, it prints the rest of the phrase starting with math. If not, it prints “dud”.
        E.g. for “She aced the mathematics test!”, it prints “mathematics test!”; for “My floor mat is so keen!”, it prints “dud”.
	 * 
	 * */
	
	public static String afterMath(String phrase) {
		
		if (phrase.contains("math")) {
			
			return phrase.substring(phrase.indexOf("math"));
			
		} else {
			
			return "dude";
		}
	}
	
	
	/*
	 * letterize(String word) - takes a word. Prints it out one letter per line. Hint: Use a loop.
		E.g. for “Java”, it prints
			J
			a
			v
			a

	 * 
	 * */
		
	public static void letterize(String word) {
		
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	  }
	
	
	
	public static void camelCase(String input) {
		String temp = "";
		 input = "";
		String [] result = input.split(" ");
		
		for(String word : result) {
			
			
			for (int i = 1; i < input.length(); i++) {
				
				if(i == 0) {
					temp += (word.charAt(i) + "").toUpperCase();
				}else {
					temp += (word.charAt(i) + "").toLowerCase();
				}
			}
			input += temp;
		}System.out.println(input);
		
	}
		

}

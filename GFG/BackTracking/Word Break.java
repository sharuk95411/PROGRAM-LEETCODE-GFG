
 // logic faad coder
public class WordBreak {
 
	public static void main(String[] args) {
		String word = "abcd";
		
		A(word);
		
	}
 
	private static void A(String word) {
		B(word, word.length(), "");
	}
 
	private static void B(String word, int length, String result) {
		
		for(int i=1; i<=length; i++)
		{
			String prefix = word.substring(0, i);
			if (dictionaryContains(prefix))
	        {
	            // if no more elements are there, print it
	            if (i == length)
	            {
	                // add this element to previous prefix
	                result = result+prefix;
System.out.println(result);/* yha order dekhna kse print ho rhe h pehle ek character lega each
possibility check krega then two chracter lekr check krega and then 3 and last me 4*/
	                return;
	            }
	            B(word.substring(i, length), length-i, result + prefix + " ");
	        }
		}
	}
 
	private static boolean dictionaryContains(String prefix) {
		
String dictionary[] = { "ab","cd","bcd","a" ,"abc","d","abcd"};//inke order se koi frk ni pdta
		int n = dictionary.length;
		for (int i = 0; i < n; i++)
			if (dictionary[i].compareTo(prefix) == 0)
				return true;
		return false;
	}
 
}
public class CountLetters {

	public static int countLetters (String str, char s) {
		int number = 0;
		if (str == null) return -1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == s) number = number +1; // number++
		}
		
		return number;
	}
    // TODO
}

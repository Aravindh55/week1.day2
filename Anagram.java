package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int length1 = text1.length();
		int length2 = text2.length();
		int match=0;
		if (length1 == length2) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			for (int i = 0; i < charArray2.length; i++) {
				for (int j = 0; j < charArray2.length; j++) {
					if (charArray1[i]==(charArray2[j])) {
						match++;
					  
					}
					else {
						match=0;
					}
					
				}
				
			}
			if (match>0) {
				System.out.println("it is a anagram");
				
			} else {
				System.out.println("not a anagram");

			}

		}
		else {
			System.out.println("not a an anagram");
		}
	}

}

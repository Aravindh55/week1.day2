package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String value ="madam";
		String revValue="";
		int len=value.length();
		char[] charArray = value.toCharArray();
		char[] charArray2 = revValue.toCharArray();
		for (int i = len-1; i >=0; i--) {
			revValue= revValue+charArray[i];
			
			
			
		}
		if (value.equals(revValue)) {
			System.out.println("palindrome");
			
			
		}
		else {
			System.out.println("not a palindrome");
		}
	

	}

}

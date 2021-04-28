
public class ReverseString {

	public static void main(String[] args) {
		
		ReverseString rs = new ReverseString();
		
		System.out.println(rs.reverse("Saritha"));
	}
	
	private String reverse(String input) {
		
		int length = input.length();
		
		char reverseChars[] = new char[input.length()];
		for(int i=0;i<length;i++) {
			reverseChars[i] = input.charAt(length-i-1);		
		}
		return new String(reverseChars);
	}
}

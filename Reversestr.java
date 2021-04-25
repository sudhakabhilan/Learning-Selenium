package week1.day2;

public class Reversestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String company = "Customer Analytics";

		char[] characters = company.toCharArray();
				
				for (int i = characters.length-1; i >= 0 ;i--) {
					System.out.print(characters[i]);
					
				}
	}

}

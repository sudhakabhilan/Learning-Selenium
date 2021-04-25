package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Declaring a Strings
		String palin = "Madam";
		String reverse = "";
		//Opening a loop
		for (int i = palin.length()-1; i >= 0; i--) 
		{
			
			//Adding characters into reverse
			
			reverse = reverse + palin.charAt(i);
			//Checking Condition 
			if(palin.equalsIgnoreCase(reverse)) 
			
				System.out.print("This word - " + reverse  +  " is a Palindrome");
		
		
		}
			
		}
	}



package week1.day2;

public class ReverseEvenWords 
{

	public static void main(String[] args)
	{
		
		String test = "I am a software tester";
		
		String[] splitedWord = test.split(" ");
		for (int i = 0; i < splitedWord.length; i++)
		
		{
			if(i%2==0) {
				
				System.out.print (splitedWord[i] + " ");
					}
			else {
		char[] charArray = (splitedWord[i]).toCharArray();
				for (int j = charArray.length -1; j >= 0; j--) {
					
					System.out.print (charArray[j]);
					
				}
			}
			
		}
		
				
		
		}
		
		
		
	}



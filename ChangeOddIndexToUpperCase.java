package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] traverse =  test.toCharArray();
		
for (int i = 0; i < traverse.length; i++) 
{
	
	if(i%2==0) 
		{
		char case1 = Character.toUpperCase(traverse[i]);
		System.out.print(case1);
		}
	else 
	{
		System.out.print( traverse[i] + " ");
	}
}
		
	}
}




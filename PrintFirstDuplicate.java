package week1.day2;

public class PrintFirstDuplicate {

	public static void main(String[] args) {
		
		String company = "Customeranalytics";
		 char[] characters = company.toCharArray();
		boolean bFounddup = false;
		for (int i = 0; i < characters.length; i++) 
		{
			for (int j = i+1; j < characters.length; j++) 
			{
				if(characters[i]==characters[j])
				
				{
				System.out.println("This is duplicate:" + characters[i]);
				bFounddup = true;
				break;
			}
			}
			if(bFounddup)
				break;
				
		
		}
		if(!bFounddup)
			System.out.println("There is no Duplicate");
		}

	}


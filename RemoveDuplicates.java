package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
	
		
		
		String[] splited = text.split(" ");
		
		for (int i = 0; i < splited.length; i++) {
			
			for (int j = i+1; j < splited.length; j++) {
				if(splited[i].equals(splited[j])) {
				splited[j] = " ";
					
				}
				
			} 
			System.out.print(splited[i]);
	}

}}

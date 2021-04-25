package week1.day2;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String word = "testleaf";
 char[] remove = word.toCharArray();


 
		 for (int i = 0; i < remove.length; i++) {
			if(remove[i] == 'a'||remove[i]=='e'||remove[i]=='i'||remove[i]=='o'||remove[i]=='u') {
				
			}else {
				System.out.print(remove[i]);
			}
			
		}
 
	}

}

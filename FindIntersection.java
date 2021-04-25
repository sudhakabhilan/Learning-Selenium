package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] myNum1 =  {3,2,11,4,6,7};
		int[] myNum2 = {1,2,8,4,9,7};
		
		for (int i = 0; i < myNum1.length; i++) {
			for (int j = 0; j < myNum2.length; j++) {
				if(myNum1[i] == myNum2[j]) {
					System.out.println(myNum1[i]+"");
				}
			}
		}
		
	
	}

}

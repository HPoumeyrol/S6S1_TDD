package tests1;

public class FizzBuzz {
	
	public static String Compute(int min, int max){
		String result = "";
		
		for(int i = min; i<=max; i++ ) {
			if(i != 0) {
				//System.out.println(i + " --> " + (i % 3));
				if((i % 15) == 0) {
					result += "FizzBuzz";
				}
				else if((i % 3) == 0) {
					result += "Fizz";
				}
				else if((i % 5) == 0) {
					result += "Buzz";
				}
				else {
					result+= i;
				}
			}
			else {
				result+= i;
			}
		}
		return result;
	}

}

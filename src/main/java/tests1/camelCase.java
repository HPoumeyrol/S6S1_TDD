package tests1;

public class camelCase {
	
	public static String transform(String aStr ) {
		String camelCasePattern = "([a-z]+[A-Z]+\\w+)+"; // 3rd edit, getting better
		
		
		String result = "";
		
		if( aStr != null) {
		
			String[] wordsList = aStr.split("[^a-zA-Z0-9]");
			
	
				
			for(int i=0; i<wordsList.length; i++)   {
				String tmp = wordsList[i];
				if(! tmp.matches(camelCasePattern)) {
					result += i == 0 ? tmp.toLowerCase() : capitalizeFirstLetter(tmp.toLowerCase());
				} 
				else
				{
					result += i>0 ? capitalizeFirstLetter(tmp) : tmp;
				}
			}
			
		}
		//System.out.println(aStr + " --> " + result);
		//System.out.println("");
		return result;
	}
	
	
	public static String transformOld(String aStr ) {
		String camelCasePattern = "([a-z]+[A-Z]+\\w+)+"; // 3rd edit, getting better
		System.out.println("camelCaseCaseCCase5".matches(camelCasePattern));
		
		String result = "";
		
		if( aStr != null) {
		
			String[] wordsList = aStr.split("[^a-zA-Z0-9]");
			
			result = wordsList[0];
			if(! result.matches(camelCasePattern)) {
				result = result.toLowerCase(); }
				
			for(int i=1; i<wordsList.length; i++)   {
				result +=  capitalizeFirstLetter(wordsList[i]);
			}
			
		}
		System.out.println(aStr + " --> " + result);
		return result;
	}
	
	
	private static String capitalizeFirstLetter(String original) {
	    if (original == null || original.length() == 0) {
	        return original;
	    }
	    return original.substring(0, 1).toUpperCase() + original.substring(1);
	}
}

package string.in;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "Java String pool refers to collection of Strings which are stored in heap memory";

	        System.out.println("Lowercase: " + str1.toLowerCase());
	        
	        System.out.println("Uppercase: " + str1.toUpperCase());
	        
	        String replacedString = str1.replace('a', '$');
	        System.out.println("Replaced String: " + replacedString);
	        
	        boolean Collection = str1.contains("collection");
	        System.out.println("Contains 'collection': " + Collection);
	        
	        String comparisonString = "java string pool refers to collection of strings which are stored in heap memory";
	        boolean stringsMatch = str1.equalsIgnoreCase(comparisonString);
	        System.out.println("Strings equal? : " + stringsMatch);
	        
	        if (!stringsMatch) {
	            boolean isEqual = str1.equals(comparisonString);
	            System.out.println("Strings are equal? : " + isEqual);
	        }

	}

}

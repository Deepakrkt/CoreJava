package stringBuffer.in;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This method returns the reversed object on which it was called";
        StringBuffer buffer = new StringBuffer(str);
        
        System.out.println(str);
        
        buffer.reverse();
        String reversedStr = buffer.toString();
        System.out.println(reversedStr);

	}

}

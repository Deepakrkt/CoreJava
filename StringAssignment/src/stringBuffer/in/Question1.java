package stringBuffer.in;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("StringBuffer")
                .append(" is a peer class of String")
                .append(" that provides much of ")
                .append("the functionality of strings");
        String result = buffer.toString();
        System.out.println(result);

	}

}

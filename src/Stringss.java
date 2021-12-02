
public class Stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="Hey this is my new String";
		System.out.println("The string I entered: "+myString);
		myString=myString+", and I am adding some more text to it";
		System.out.println("The string I entered: "+myString);
		// We can also add characters to string using unicode. So unlike char we can actually add a significant amount of characters to it.
		
		myString=myString+ " \u00A9 2021";
		System.out.println("The string I entered: "+myString);
		// Strings in java are immutable so 

	}

}


public class ByteShortIntLong {

	public static void main(String[] args) {
		// Can we store infinite numbers in int data type or is there some range?
		int minIntValue=Integer.MIN_VALUE;
		int maxIntValue=Integer.MAX_VALUE;
		System.out.println("Maximum Integer Value: "+ maxIntValue);
		System.out.println("Minimum Integer Value: "+ minIntValue);
		System.out.println("Busted MAX Value: "+(maxIntValue+1)); // In the answer as you see this turns into a negative number. This is called an Overflow. We try to put too large a number into the space allocated for integer.
		System.out.println("Busted MIN Value:"+(minIntValue-1)); // Underflow Example. In this we do -1 to the minimum value.
	}

}

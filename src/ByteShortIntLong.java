
public class ByteShortIntLong {

	public static void main(String[] args) {
		// Can we store infinite numbers in int data type or is there some range?
		int minIntValue=Integer.MIN_VALUE;
		int maxIntValue=Integer.MAX_VALUE;
		System.out.println("Maximum Integer Value: "+ maxIntValue);
		System.out.println("Minimum Integer Value: "+ minIntValue);
		System.out.println("Busted MAX Value: "+(maxIntValue+1)); // In the answer as you see this turns into a negative number. This is called an Overflow. We try to put too large a number into the space allocated for integer.
		System.out.println("Busted MIN Value:"+(minIntValue-1)); // Underflow Example. In this we do -1 to the minimum value.
		
		
		// We are going to see the same for the byte data type.
		byte minByteValue=Byte.MIN_VALUE;
		byte maxByteValue=Byte.MAX_VALUE;
		System.out.println("Minimum Byte Value: "+minByteValue);
		System.out.println("Maximum Byte Value: "+maxByteValue);
		
		// We are going to see the same for the short data type.
		short minShortValue=Short.MIN_VALUE;
		short maxShortValue=Short.MAX_VALUE;
		System.out.println("Minimum Short Value: "+minShortValue);
		System.out.println("Maximum Short Value: "+maxShortValue);

		short max=32_767;
		System.out.println(max);
		
		
		// We are going to see the same for the long data type.
		long minLongValue=Long.MIN_VALUE;
		long maxLongValue=Long.MAX_VALUE;
		// You need to specify the 'l' otherwise it will treat as int.
		long myLongValue=1000_1000000000l;
		System.out.println(myLongValue);
		System.out.println("Minimum Long Value: "+minLongValue);
		System.out.println("Maximum Long Value: "+maxLongValue);
		
		
		// We are going to learn to typecast now. Java usually uses int by default in any operation so sometimes we need to typecast it otherwise we get an error.
		 int myTotal=(minIntValue/2);
		 System.out.println(myTotal);
		 // byte myNewByteValue= (minByteValue/2); But when you do this you get an error because it treats it like an int by default and you need to type cast it into byte.
		 byte myNewByteValue= (byte) (minByteValue/2);
		 System.out.println(myNewByteValue);
		 // Similarly for short data type
		 short myNewShortValue=(short) (minShortValue/2);
		 System.out.println(myNewShortValue);
		
		
	}

}

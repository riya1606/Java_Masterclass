
public class PrimitiveTypeChallenge {

	public static void main(String[] args) {
		byte byteNumber=12;
		short shortNumber=120;
		int intNumber=1200;
		long longNumber=50000L+(10L*(byteNumber+shortNumber+intNumber));
		System.out.println(longNumber);

	}

}

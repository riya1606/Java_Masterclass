
public class FloatAndDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float myMinFloatValue=Float.MIN_VALUE;
		float myMaxFloatValue=Float.MAX_VALUE;
		System.out.println("Minimum Float Value is: "+myMinFloatValue);
		System.out.println("Maximum Float Value is: "+myMaxFloatValue);
		double myMinDoubleValue=Double.MIN_VALUE;
		double myMaxDoubleValue=Double.MAX_VALUE;
		System.out.println("Minimum Double Value is: "+myMinDoubleValue);
		System.out.println("Maximum Double Value is: "+myMaxDoubleValue);
		
		// float myFloatValue=5.25; This will give an error. So instead of doing this we need to add an 'f' in the end to it or we need to type cast it.
		float myFloatValue=5.25f;
		double myDoubleValue=6.75;
		System.out.println("My float value is: "+ myFloatValue);
		System.out.println("My double value is: "+myDoubleValue);
		
		
		// you can see the difference in the precision.
		int intValue=5/3;
		float floatValue=5f/3f;
		double doubleValue=5d/3d;
		System.out.println("Integer value is: "+intValue);
		System.out.println("Float value is: "+floatValue);
		System.out.println("Double value is: "+doubleValue);
	}

}


public class Conditionals {

	public static void main(String[] args) {
		boolean isAlien=false;
		// Always use a code block in case of if and else statement to make the code legible and also to run all the statements that are part of it.
		if(isAlien==false) {
			System.out.println("It is not an alien!");
			System.out.println("I am very scared of aliens");
		}
		
		// AND logical operator
		int topScore=100;
		int secondTopScore=60;
		if (topScore>secondTopScore && topScore<=100) {
			System.out.println("Greater than second top score and less than or eqaul to 100");
		}
		if (topScore>secondTopScore || topScore>100) {
			System.out.println("Greater than second top score or top score is greater than 100. If any of that is true, the whole things is true ");
		}
		int ageOfClient=20;
		boolean isEighteenOrOver=ageOfClient==20?true:false;
		System.out.println(isEighteenOrOver);
		
	}

}

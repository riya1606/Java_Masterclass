
public class OperatorChallenge {

	public static void main(String[] args) {
		double var_1=20.00;
		double var_2=80.00;
		double sum=var_1+var_2;
		double var_3=sum*100;
		double rem=var_3%40.00;
		boolean var_4;
		if(rem==0) {
			var_4=true;
		}
		else {
			var_4=false;
		}
		System.out.println(var_4);
		if(!var_4) {
			System.out.println("Got some remainder");
		}
	}

}

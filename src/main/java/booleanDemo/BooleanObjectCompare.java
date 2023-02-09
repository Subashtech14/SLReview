package booleanDemo;
class Account{
	
}
public class BooleanObjectCompare {

	public static void main(String[] args) {
		Account a=new Account();
		Account b=new Account();
		//Always false because objects are stored in different memory location
		if(a==b) {
			System.out.println("objects are in different memory location");
		}
	}

}

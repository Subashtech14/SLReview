package breakDemo;

public class BreakwithLoop {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i==5) {
				System.out.println("break executed");
				break;
			}
			System.out.println(i);
		}

	}

}

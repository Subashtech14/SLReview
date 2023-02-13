package train;

class demo<T>{
	T obj;
//	String obj;
	demo(T obj){
		this.obj=obj;
	}
	public void display() {
		System.out.println(obj.getClass());
	}
}
public class Generic {
public static void main(String[] args) {
	int max=Integer.MAX_VALUE; 
	String name="Mahitha";
//	System.out.println();
//	System.out.println(max);
	new demo(2).display();
}
}

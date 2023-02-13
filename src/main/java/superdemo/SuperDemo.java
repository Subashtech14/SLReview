package superdemo;
//variables and constructor call
class Animal{  
	Animal(){
		System.out.println("Parent Constructor");
	}
String color="white";  
}  
class Dog extends Animal{  
	Dog(){
		super();
	}
	
void printColor(){  
	
System.out.println(color);
System.out.println(super.color); 
}  
}  

public class SuperDemo {

	public static void main(String[] args) {
	new Dog().printColor();

	}

}

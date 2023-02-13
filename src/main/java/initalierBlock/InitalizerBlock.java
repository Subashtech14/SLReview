package initalierBlock;

class A{  
A(){  
System.out.println("parent class constructor invoked");  
}  
}  
class B2 extends A{  
	{System.out.println("instance initializer block is invoked");}
B2(){  
super();  
System.out.println("child class constructor invoked");  
}  
  
  }
public class InitalizerBlock {
	    public static void main(String args[]){  
	    	B2 b=new B2();
	    }
//	    Bike7 b1=new Bike7();  
//	    Bike7 b2=new Bike7();  
//	    }      

}

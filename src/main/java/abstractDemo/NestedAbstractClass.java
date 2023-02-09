package abstractDemo;
abstract class Vehicle  
{  
    abstract class Car   
    {  
        abstract void display();  
    }  
}  
class Honda extends Vehicle  
{  
    class FourWheller extends Car  
    {  
   
    void display() {  
          
        System.out.println("nested abstract class is invoked");  
    }     
}  
}  
public class NestedAbstractClass {
public static void main(String[] args) {
//	Vehicle obj=new Honda();  
//    Honda h=(Honda)obj;  
//    Honda.FourWheller fw=h.new FourWheller();  
//     fw.display();  
	Honda.FourWheller vehicles=new Honda().new FourWheller();
	vehicles.display();
}
}

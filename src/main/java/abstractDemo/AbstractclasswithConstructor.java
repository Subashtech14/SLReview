package abstractDemo;
abstract class Vehicle  
{  
    String msg;  
      
    Vehicle(String msg)  
    {  
    this.msg=msg;  
    }  
      
    void display()  
    {  
        System.out.println(msg);  
    }  
      
}  
class Honda extends Vehicle  
{  
  
    Honda(String msg) {  
        super(msg);  
          
    }  
  
}  
public class AbstractclasswithConstructor {

	public static void main(String[] args) {
		Honda honda=new Honda("Super Constructor Involked");
		honda.display();

	}

}

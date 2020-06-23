package nn;
class Bird extends Animal
{
	public void eat() {
   	  System.out.println("bird eating method");
    }
    public void sleep() {
   	  System.out.println("bird sleeping method");
    }
    public void fly() {
   	 System.out.println("bird sleeping method");
    }
}
public class demo{
	public static void main(String[] args){
	Bird obj=new Bird();
	obj.eat();
	obj.sleep();
	obj.fly();
    Animal ob1=new Animal();
    ob1.eat();
    ob1.sleep();
}
}



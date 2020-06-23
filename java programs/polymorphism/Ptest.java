package nn;

class fruit {
	String name;
	String Taste;
	int size;
	fruit(String nam,String taste,int s){
		this.name=nam;
		this.Taste=taste;
		this.size=s;
	}
	public void eat() {
		System.out.println(this.name+" "+"is"+" "+this.Taste);
	}
}
class Apple extends fruit{
	Apple(String name,String Taste,int size){
		super(name,Taste,size);
	}
	public void eat() {
		super.eat();
		System.out.println(this.name+" "+"is"+" "+this.Taste);
	}
}
class Orange extends fruit{
	String name1="orange";
	String Taste1="tasty";
	Orange(String name,String Taste,int size){
		super(name,Taste,size);
	}
	public void eat() {
		super.eat();
		System.out.println(this.name1+" "+"is"+" "+this.Taste1);
	}
}

public class Ptest {
   public static void main(String[] args) {
	   Orange n=new Orange("apple","delicious",20);
	   n.eat();
   }
}

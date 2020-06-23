package nn;

class Book1 extends Author {
	  String B_name;
	  int price;
	  int qtyinstock;
	  Book1(String name,String email,String gender,String B_name,int price,int qtyinstock){
		  super(name,email,gender);
		  this.B_name=B_name;
		  this.price=price;
		  this.qtyinstock=qtyinstock;
	  }
	public void setB_name(String b_name){
		B_name = b_name;
	 }
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQtyinstock(int qtyinstock) {
		this.qtyinstock = qtyinstock;
	}
	 public String getB_name() {
			return B_name;
		}
	public int getPrice() {
		return price;
	}
	public int getQtyinstock() {
		return qtyinstock;
	}
}	
public class Test{
	public static void main(String[] args) {
	    Book1 s1=new Book1("nandhini","nandhini2162000@gmail.com","female","story book",900,20);
			 System.out.println(s1.getName());
			 System.out.println(s1.getEmail());
			 System.out.println(s1.getGender());
			 System.out.println(s1.getB_name());
			 System.out.println(s1.getPrice());
			 System.out.println(s1.getQtyinstock());
			
	   }
  }

package nn;

public class c1 {
	c1(int height,int width,int depth){
		System.out.println("three parameter:");
	}
	public int display(int height,int width,int depth) {
		 return height*width*depth;
	}
	public static void main(String[] args)
	{
		c1 obj=new c1(2,3,4);
		System.out.println(obj.display(1,4,5));
		
	}

}

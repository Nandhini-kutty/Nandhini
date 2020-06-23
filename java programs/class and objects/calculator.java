package nn;

public class calculator {
	static int powerint(int num1,int num2) { 
		return (int)Math.pow(num1,num2);
	}
	static double powerdouble(double num1,int num2) {
		return (int)Math.pow(num1,num2);
	}
	public static void main(String args[])
	{
		calculator s1=new calculator();
		System.out.println(powerint(2,3));
		System.out.println(powerdouble(10,4));
	}

}

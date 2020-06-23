package nn;

class TestEmployee {
	public static void main(String[] args)
	{
	  Employee obj1=new Employee();
	  obj1.setName("nandhini");
	  System.out.println(obj1.getName());
	  obj1.setAnnualsalary(23000);
	  obj1.setSwork("21-06-2000");
	  obj1.setInsurance("hello");
	  System.out.println(obj1.getAnnualsalary());
	  System.out.println(obj1.getSwork());
	  System.out.println(obj1.getInsurance());
	}

}

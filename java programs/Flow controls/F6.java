public class F6{
   public static void main(String[] args){
         String s1=args[0];
         int age=Integer.parseInt(args[1]);
         if(s1.equals("Female"))
          {
           if(age>=1 &&age<=58)
            {
              System.out.println("8.2%.");
            }
           else
            {
             System.out.println("9.2%.");
            }
          }
         else if(s1.equals("Male"))
          {
           if(age>=1 &&age<=58)
            {
              System.out.println("8.4%.");
            }
           else
            {
             System.out.println("10.5%.");
            }
          }
                  
}
}

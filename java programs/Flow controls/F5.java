public class F5{
   public static void main(String[] args){
         char str='a';
         if((str>=65 && str<=90) || (str>=97 && str<=120))
         {
             System.out.println("Alphabet");
         }
         else if(str>=48 && str<=57)
         {
             System.out.println("Digit");
         }
         else
          {
             System.out.println("Special charater");
          }
      
}
}

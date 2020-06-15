import java.util.*;
public class F12{
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       int n,flag=1;
       n=s.nextInt();
       for(int i=2;i<=n/2;i++)
        {
          if(n%i==0)
           {
             flag=0;
             break;
           }
         } 
        if(n==1){ 
            System.out.println("nither prime or not");
        }
        else{
           if(flag==1)
              System.out.println("prime number");
           else
               System.out.println("is not prime number");  
         }
   }
}

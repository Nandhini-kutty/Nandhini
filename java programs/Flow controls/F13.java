import java.util.*;
public class F13{
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       Scanner s1=new Scanner(System.in);
       int n,flag=1,n1;
       n=s.nextInt();
       n1=s1.nextInt();
       for(int i=n;i<=n1;i++)
        {
        for(int j=2;j<=i;j++){
          if(i%j==0)
           {
             flag=0;
             break;
           }
          else
          {
           System.out.print(i);
           System.out.print(" ");
           break;
         } 
       }
      }
      
   }
}

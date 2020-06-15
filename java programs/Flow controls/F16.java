import java.util.*;
public class F16{
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       int n,rem,sum=0;
       n=s.nextInt();
       while(n!=0)
       {
         rem=n%10;
         sum=(sum*10)+rem;
         
         n=n/10;
       }
        System.out.print(sum);
       
}
}

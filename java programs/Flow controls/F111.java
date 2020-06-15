import java.util.*;
public class F111{
   public boolean lastDigit(int a,int b){
         int c=a%10;
         int d=b%10;
         if(c==d)
           return true;
         else
           return false;
   }
   public static void main(String[] args){
        F111 p=new F111();
        System.out.println(p.lastDigit(7,117));
        System.out.println(p.lastDigit(7,23));
   }
}

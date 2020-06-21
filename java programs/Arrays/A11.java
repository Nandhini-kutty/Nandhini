import java.util.*;
public class A11{
     public boolean only(int[] a,int size){
         for(int i=0;i<size;i++)
          {
             if(a[i]==1 || a[i]== 4)
               continue;
             else 
               return false;
          }
         return true;
    }
   public static void main(String[] args){
      System.out.println("enter first array");
      Scanner n=new Scanner(System.in);
      int size=n.nextInt();
      int[] a=new int[size];
      for(int i=0;i<size;i++)
      {
         a[i]=n.nextInt();
      }
      System.out.println(new A11().only(a,size));
      
}
}

        
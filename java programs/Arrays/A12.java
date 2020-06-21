import java.util.*;
public class A12{
   public static void middleway(int[] a,int[] b,int size1,int size2){
       int l1,l2;
       if(a.length%2==0)
         l1=a.length/2;
       else
         l1=(a.length/2);
      
       if(b.length%2==0)
         l2=b.length/2;
       else
          l2=(b.length/2);
   
      for(int i=0;i<size1;i++)
       {
         if(i!=l1)
            continue;
         else
            System.out.print(a[i]+",");
       }   
      for(int i=0;i<size2;i++)
       {
         if(i!=l2)
            continue;
         else
           System.out.print(b[i]);
       }



}
    public static void main(String[] args){
      System.out.println("enter first array");
      Scanner n=new Scanner(System.in);
      int size1=n.nextInt();
      int[] a=new int[size1];
      for(int i=0;i<size1;i++)
      {
         a[i]=n.nextInt();
      }
      
      System.out.println("enter second array");
      Scanner n1=new Scanner(System.in);
      int size2=n1.nextInt();
      int b[]=new int[size2];
      for(int i=0;i<size2;i++)
      {
         b[i]=n1.nextInt();
      }
      middleway(a,b,size1,size2);

 }    
}
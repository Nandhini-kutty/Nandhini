import java.util.*;
public class A8{
   public static void main(String[] args){
      System.out.println("enter first array");
      Scanner n=new Scanner(System.in);
      int size=n.nextInt();
      int[] a=new int[size];
      for(int i=0;i<size;i++)
      {
         a[i]=n.nextInt();
      }
      int m=6;
      int n1=7;
      int x=0,p=0;
      for(int i=0;i<size;i++)
       {
        if(a[i]==m)
            p=i;
       
        else if(a[i]==n1)
           x=i;
        else
          continue;
       }
       int sum=0;
       int sum1=0;
       if(m<n1)
       {
       for(int i=0;i<p;i++)
         sum=sum+a[i];
       for(int i=x+1;i<=size-1;i++)
         sum1=sum1+a[i];
       }
       System.out.println(sum1+sum);
    
  
}
}

        
import java.util.*;
public class A10{
     public static void evenodd(int a[],int size){
             int l=0,r=size-1;
             while(l<r)
              {
               while(a[l]%2==0 && l<r)
                  l++;
               while(a[r]%2==1 && l<r)
                  r--;
               if(l<r)
               {
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;  
             }
        }
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
     evenodd(a,size);
     for(int i=0;i<size;i++)
      {
       System.out.println(a[i]+" ");
      }
}
}

        
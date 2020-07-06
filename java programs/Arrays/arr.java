import java.util.Scanner;
class arr{
    public static void main(String args[] ) {
       Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       {
        arr[i]=obj.nextInt();
      }
       int k=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]!=0)
          {
           arr[k++]=arr[i];
          }
       }
      System.out.println("k value"+k);

      for(int i=k;i<n;i++)
        arr[i]=0;

      for(int i=0;i<n;i++)
        System.out.println(arr[i]);
  }
}

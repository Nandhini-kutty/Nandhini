import java.util.Arrays;
public class A5{
   public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5};
        int lar1=arr[0];
        int lar2=arr[1];
        if(lar1<lar2){
           int temp=lar1;
           lar1=lar2;
           lar2=temp;
         }
         for(int i=2;i<arr.length;i++){
             if(arr[i]>lar1)
             {
               lar2=lar1;
               lar1=arr[i];
            }
            else if(arr[i]>lar2 && arr[i]!=lar1)
             {
              lar2=arr[i];
             }
        }
        System.out.println("maximum element 1 is "+" "+ lar1);
        System.out.println("maximum element  2 is "+" "+ lar2);
       int min1=arr[0];
       int min2=arr[1];
       if(min1<min2){
           int temp=min1;
           min1=min2;
           min2=temp;
         }
         for(int i=2;i<arr.length;i++){
             if(arr[i]<min1)
             {
               min2=min1;
               min1=arr[i];
            }
            else if(arr[i] < min2 && arr[i]!=min1)
             {
              min2=arr[i];
             }
        }
        System.out.println("manimum element  1 is "+" "+ min1);
        System.out.println("manimum element  2 is"+" "+ min2);
     
       
      
       
}
}
import java.util.*;
public class A6{
   public static void main(String[] args){
        int[] arr=new int[]{5,4,3,2,1};
        int temp; 
        int len=arr.length;
        for(int i=0;i<=len-1;i++){
          for(int j=i+1;j<=len-1;j++){
             if(arr[i] > arr[j]){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }  
    }
      for(int i=0;i<=len-1;i++){
         System.out.println(arr[i]);
       }
  }
}
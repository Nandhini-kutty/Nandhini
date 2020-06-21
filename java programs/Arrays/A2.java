import java.util.Arrays;
public class A2{
   public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5};
        int lar=arr[0];
        for(int i=1;i<=arr.length-1;i++){
           if(arr[i] > lar){
              lar=arr[i];
          }
        
       }
        System.out.println("maximum element is"+" "+ lar);
       
       int min=arr[0];
       for(int i=1;i<=arr.length-1;i++){
           if(arr[i]< min){
              min=arr[i];
          }
       }
       System.out.println("minimum element is"+" "+ min);
       
      
       
}
}
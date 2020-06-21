import java.util.*;
public class A3{
   public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5};
        Scanner key=new Scanner(System.in);
        int n=key.nextInt(); 
        for(int i=1;i<=arr.length;i++){
           if(arr[i] == n){
              System.out.println(i);
              break;
           }
           else{
              System.out.println(-1);
              break;
            }
       }
        
       
      
       
}
}
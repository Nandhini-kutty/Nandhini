import java.util.Arrays;
public class A1{
   public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5};
        int sum=0;
        int len=arr.length; 
        System.out.println(len);
        for(int i=0;i<len;i++){
          sum=sum+arr[i];
       }
       System.out.println("sum is"+" "+sum);
       System.out.println("avg is"+" "+sum/len);
       
}
}
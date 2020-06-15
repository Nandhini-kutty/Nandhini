import java.util.Arrays;
public class F4{
   public static void main(String[] args){
         char[] chararray=new char[] {'s','e'};
         int p=1;
         for( char i:chararray){
           System.out.print(i);
           if(chararray.length>p)
           {
             System.out.print(",");
             p++;
           }
       }
            
         Arrays.sort(chararray);
}
}

public class A13{
   public static void main(String[] args){
        int[][] x=new int[2][2];
        int p=0;
         System.out.println(x.length); 
         System.out.println("The given array is:");
         if(args.length>=4)
          {
          for(int i=0;i<x.length;i++)
           {
           for(int j=0;j<x[i].length;j++)
           {
              x[i][j]=Integer.parseInt(args[p++]);
              System.out.print(x[i][j]+" ");
              System.out.print(" ");
           } 
           System.out.println("");
         }
       }
        else
           System.out.println("please enter 4 integer");
       
       System.out.println("The reverse array is:"); 
       
       
       for(int i=x.length-1;i>=0;i--)
           {
           for(int j=x[i].length-1;j>=0;j--)
           {
              System.out.print(x[i][j]+" ");
              System.out.print(" ");
           } 
           System.out.println("");
         }      
}    
}
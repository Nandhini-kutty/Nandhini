public class A14{
   public static void main(String[] args){
        int[][] x=new int[3][3];
        int p=0;
         if(args.length>=9)
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
           System.out.println("please enter 9 integer");
         int max=Integer.MIN_VALUE;
        for(int i=0;i<x.length;i++)
           {
           
           for(int j=0;j<x[i].length;j++)
           { 
               if(max<x[i][j])
                 {
                   max=x[i][j];
                 }
            }
          }
          System.out.println("BiggestNUmber is:"+max);
            
}    
}
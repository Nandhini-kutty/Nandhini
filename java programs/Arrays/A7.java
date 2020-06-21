class A7 
{ 
    static int A7(int arr[], int n) 
    { 
        int[] temp = new int[n]; 
          
        int j = 0; 
        for (int i=0; i<n-1; i++) 
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
        temp[j++] = arr[n-1];    
        for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
       
        return j; 
    } 
      
    public static void main (String[] args)  
    { 
        int arr[]  ={12,12,34,45,56,67};
        int n = arr.length; 
          
        n = A7(arr, n); 

        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 
    } 
} 
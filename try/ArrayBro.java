package try;

public class ArrayBro {

 


    public static void main(String[] args) {

        int arr [] [] = { 
            {1, 2, 3},   // Row 0
            {4, 5, 6},   // Row 1
            {7, 8, 9} 
           
        };

      for (int i = 0; i <3; i++) {
        for (int j = 0; j <3; j++) {
            arr[i][j]=arr[2-i][j];
        System.out.print(arr[i][j]);
        
      }
       System.out.println();

        
        

        
    }
}
}

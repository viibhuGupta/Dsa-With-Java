import java.util.Scanner;

public class Sprial_Matrix {
      
      static void PrintMatrix (int [] [] matrix){
            for (int i = 0 ; i < matrix.length ; i++){
                  for(int j = 0 ; j < matrix[i].length ; j++){
                  System.out.print(matrix[i][j]+ " ") ;
                  }
                  System.out.println();
            }

      }



      static void PrintSprialOrdermatrix (int [] []matrix , int r , int c ){

            int topRow = 0 , bottomRow = r-1 , leftCol = 0  , rightCol = c-1;

            int totalElement = 0;

            while (totalElement < r*c){
                   
                  // Top Row => leftcol to Right col 
                  
                  for(int j = leftCol ; j <= rightCol &&  totalElement < r*c ; j++){
                        System.out.print(matrix[topRow][j]  +" ");
                        totalElement++;
                  }
                  topRow++;
                  

                  //  rightCol  => TopROw to BottomRow

                  for(int i = topRow; i <= bottomRow &&  totalElement < r* c  ; i++){
                        System.out.print(matrix[i][rightCol] +" ");
                        totalElement++;

                  }
                  rightCol--;
                 


                  //  BottomRow => RightCol to leftCol

                  for(int j = rightCol ; j >=  leftCol  &&  totalElement < r * c ; j--){
                        System.out.print( matrix[bottomRow][j] + " ");
                        totalElement++;
                  }
                  bottomRow--;
                  


                  for(int i = bottomRow; i >= topRow &&  totalElement < r * c ; i--){
                        System.out.print(matrix[i][leftCol] +" ");
                        totalElement++;
                  }
                  leftCol++;
                  



            }

      }


      public static void main(String[] args) {  
       
            Scanner sc = new Scanner (System.in);

            System.out.println("Enter the Row And Column of a Matrix");

            //  user Input 
            int r = sc.nextInt();
            int c = sc.nextInt(); 
            // System.out.println();t();

            int [] [] matrix = new int [r] [c];
            int total = r * c;

            System.out.println("Enter "+total+" Value");

                  for(int i = 0 ; i < r; i++){
                        for(int j = 0 ; j< c; j++){
                              matrix[i][j] = sc.nextInt();
                        }
                  }

                  System.out.println("Input Matrix");

                  PrintMatrix(matrix);

                  System.out.println("Sprial Matrix ");

                 PrintSprialOrdermatrix(matrix,r,c);




      }
}

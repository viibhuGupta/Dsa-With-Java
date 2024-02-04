import java.util.Scanner;

public class Prefix_matrix {


      static int findSum (int [] [] matrix , int l1 , int r1 , int l2 , int r2){
            int sum = 0;

            for (int i = l1; i <= l2; i++) {
                  for(int j = r1 ; j <= r2 ; j++){
                        sum += matrix[i] [j];
                  }
            }
            return sum ;
      }
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Row And Column Of Matrix");
            int row =sc.nextInt();
            int col =sc.nextInt();
            int matrix [][] = new int [row] [col];
            int total = row * col;
            System.out.println("Enter " +total+" value");



            //  we take a MAtrix as Input

            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            // pritn Rectangle
            System.out.println("Enter Rectangle boundries l1 , r1 , l2, r2");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r3 = sc.nextInt();

            System.out.println("Rectange Sum " + findSum(matrix, l1, r1, l2, r3));

      }
}

import java.util.Scanner;

public class sumOf_prefix_Without_NestedLoop {

      static void GeneratePrefix (int matrix [][]){


            //   generate PreFix Matrix
            int r = matrix.length;
            int c = matrix[0].length;  // first index matrix length calculate



            // Trverse Horizently to row wise Prefix sum
            for (int i = 0; i < r; i++) {
                  for (int j = 1; j < c; j++) {
                        matrix[i] [j] += matrix[i] [j-1];

                  }

            }

      }

      static int SumPrefixMatrix (int [][] matrix , int l1 , int r1 , int l2 , int r2 ){
            int sum = 0;

            GeneratePrefix(matrix);

            for (int i = r1; i <= r2; i++) {
                  if (r1 >= 1) {
                     sum += matrix[i][r2] - matrix[i] [r1-1];
                  }
                  else{
                        sum += matrix[i] [r2];
                  }

            }

            return sum ;
      }
      public static void main(String[] args) {

            Scanner sc = new Scanner (System.in);

            System.out.println("Enter Row And Column Of Matrix");

            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix [] [] = new int [r] [c];

            int Total = r * c;

            System.out.println("Enter " +Total + " Value");

            for(int i = 0 ; i< r ;i++){
                  for (int j = 0; j < c; j++) {
                        matrix[i][j] = sc.nextInt();

                  }
            }

            System.out.println("Enter Rectangle Boundries l1 r1 l2 r2 ");

            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();


            System.out.println("Rectangle Sum = "+SumPrefixMatrix(matrix, l1, r1, l2, r2));



      }

      }


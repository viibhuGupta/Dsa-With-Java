import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array_90_deg{

 
 public static void printMatrix(int arr[][]){

    // int row = matrix.length ;
    // int col = matrix[0].length;

    for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr.length; j++){
           System.out.print(arr[i][j]+" ");
           
        }
        System.out.println(" ");
    }
}

public static void  transposeMatrix (int [][] matrix, int row , int col){
    int temp;
    for (int i = 0; i < col; i++){
        for (int j = i; j < row;j++){
            temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}


public static void rotateArray(int [][] matrix , int n){
    transposeMatrix(matrix, n, n);

    for (int i = 0; i < n; i++){
reverseArray(matrix[i]);
    }
}

public static void reverseArray(int [] arr){
int i = 0 , j =arr.length -1;

while (i < j){
    int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
}
}




    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("\n Rotate Matrix : \n");

        System.out.println("Enter the Row And Column Of Matrix");
        int row =sc.nextInt();
        int col =sc.nextInt();

        int matrix [][] = new int [row] [col];

        int total = row * col;
        System.out.println("Input "+total+" Element");

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix Entered By User");
        printMatrix(matrix);

        rotateArray(matrix, row);
        System.out.println("Rotate Matrix");
        printMatrix(matrix);

    }
}
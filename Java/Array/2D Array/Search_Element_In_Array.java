import java.util.Scanner;

public class Search_Element_In_Array {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int arr [] = {1 , 2 , 3,4,5,6};
            System.out.println("Enter the N To Find in Array");
            int n = sc.nextInt();

      for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                  System.out.println(i);
            }
      }

      }
}
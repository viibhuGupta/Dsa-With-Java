/* Search Element in Array Given By User
 *
 * in THis Question We start a loop from i = 0 and then we run that loop until its smaller than the size of Array
 *
 * then in The Loop we Check That given By the User N is Equal To Array of I or not if it is Equal To Array of I then We Print the Index of I
 * or IF the Arrya of i Is not equal to Array of i then We return the -1;
 */
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

            else{
                  System.out.println("Item not Avaliable In this Array ");
                  break;
            }




      }





      }
}
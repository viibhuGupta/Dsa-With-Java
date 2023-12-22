/* Reverse An Array List  */
package Java.Array.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Reverse_An_Array_or_ArrayList {


      static void ArrayReverse (ArrayList<Integer> list){
            int i = 0 , j = list.size() - 1;

          while (i < j) {
              // To Swap For Reverse
            // temp = i ;
            // i = j;
            // j=temp;

            Integer temp = Integer.valueOf(i); // puting the i value of temp
            list.set(i, list.get(j)); //puting the j index value at i index
            list.set(j, temp); // puting the temp index value at j index

            i++;
            j--;

          }

      }
      public static void main(String[] args) {
            ArrayList<Integer> list  = new ArrayList<>();

            list.add(5);
            list.add(6);
            list.add(7);
            list.add(9);
            list.add(8);
            list.add(4);

            System.out.println("Array List : "+list);

            ArrayReverse(list);
            System.out.println("Reverse Array List : " + list);


            // Reverse Array using Collection Class Method
            Collections.reverse(list);
            System.out.println("Reverse Array List Using Collection Class Method: " + list);




      }
}

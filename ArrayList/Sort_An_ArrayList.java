/* Sort Element In Array List Using Collections Method */
package ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class Sort_An_ArrayList {
      public static void main(String[] args) {
            ArrayList <Integer> list = new ArrayList<>();

            list.add(6);
            list.add(5);
            list.add(8);
            list.add(4);
            list.add(3);
            list.add(9);
            list.add(1);

            System.out.println("Array List : "+list);

            //  Sort Array List Using Collection Class Method

            Collections.sort(list); // Assenting Order Sort
            System.out.println("Sort ArrayList In Assending Order : "+list);

            Collections.sort(list , Collections.reverseOrder());  // Decending Order
            System.out.println("Sort ArrayList In Dece Order : "+list);

      }

}

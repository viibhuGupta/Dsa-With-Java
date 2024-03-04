/* Write a Java program to remove the third element from given arraylist of size n. */
package ArrayList;

import java.util.ArrayList;

public class Remove_the_third_element_from_given_arraylist_of_size_n {
      public static void main(String[] args) {
            ArrayList <Integer> list = new ArrayList<>();

            list.add(3);
            list.add(9);
            list.add(8);
            list.add(1);
            list.add(3);
            list.add(0);
            list.add(4);

            System.out.println("Orginal  Array List :"+list);
            list.remove(2);
            System.out.println("Removed Third element : "+list);

            
      }

}

/*  Write a Java program to insert an element into given array list of size n at the first position.*/
package Java.Array.ArrayList;

import java.util.ArrayList;

public class insert_an_element_into_given_array_list_of_size_n_at_the_first_position {
      public static void main(String[] args) {

            ArrayList <Integer> list = new ArrayList<>();

            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            System.out.println("Orginal Array List : "+list);
            list.add(0,0);
            System.out.println("After Adding at o Index : "+list);

            

      }

}

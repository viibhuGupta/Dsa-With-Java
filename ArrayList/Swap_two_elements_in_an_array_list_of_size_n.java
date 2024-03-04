/* Write a Java program to swap two elements in an array list of size n */
package ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Swap_two_elements_in_an_array_list_of_size_n {

      static void swapArrayList ( ArrayList <Integer> li ){
            int i = 0 , j = li.size() -1;

            Integer temp = Integer.valueOf(i);
            li.set(i, li.get(j));
            li.set(j, temp);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> list = new ArrayList<>();

            list.add(5);
            list.add(3);
            list.add(1);
            list.add(8);
            list.add(9);
            list.add(2);
            list.add(7);

            System.out.println("Orginal Array list : "+list);

            System.out.println("Enter First And Second Element : ");
            int first = sc.nextInt();
            int second = sc.nextInt();



            swapArrayList(list);
            // System.out.println(list);

            Collections.swap(list, first, second);
            System.out.println("Swap Array List " +list );




      }

}

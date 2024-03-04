/*  Given an input of some integers, sort the integers */
// package Java.Array.ArrayList;
package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Input_of_some_integers_sort_the_integers {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            ArrayList <Integer> list = new ArrayList<>();


            System.out.println("Enter the Element Of Array List : ");
            int first = sc.nextInt();
            int sec = sc.nextInt();
            int thi = sc.nextInt();
            int four = sc.nextInt();
            int fifth = sc.nextInt();
            int six = sc.nextInt();
            int sev = sc.nextInt();
            list.add(first);
            list.add(sec);
            list.add(thi);
            list.add(four);
            list.add(fifth);
            list.add(six);
            list.add(sev);


            System.out.println("Orginal Array List : "+list);

            Collections.sort(list);
            System.out.println("Sorted Array List : "+list);

            


      }

}

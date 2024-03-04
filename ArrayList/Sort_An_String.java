package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Sort_An_String {
      public static void main(String[] args) {
            ArrayList <String> list = new ArrayList<>();

            list.add("Hy");
            list.add("How");
            list.add("are");
            list.add("You");

            System.out.println("Orginal Array List : "+list);

            //  Sort Array List
            Collections.sort(list);
            System.out.println("Sorted String In Acending Order : "+list);

            Collections.sort(list, Collections.reverseOrder());
            System.out.println("Sorted String In Dece Order : "+list);


      }
}

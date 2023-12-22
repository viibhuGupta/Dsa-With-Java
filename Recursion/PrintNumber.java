package Java.Recursion;

import java.util.Scanner;

public class PrintNumber {

    public static void  increasingInteger (int n ){
        if(n == 1){
            System.out.println(n);
            return;
        }
          
        increasingInteger(n-1);
        System.out.println(n);

        
    }
  
    public static void main (String [] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number :");
        int num = sc.nextInt();

        increasingInteger(num);
    
          
    }
}

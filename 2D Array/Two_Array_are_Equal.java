import java.util.Arrays;

/* https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions */

public class Two_Array_are_Equal {

//  EX OF BUBBLE SORT ALGORITHM
      static int [] sortArray (int arr[]){

            for(int i = 0 ; i < arr.length ; i++){
                  for(int j = 0 ; j < arr.length ; j++){
                        if (arr[j] > arr[i]) {
                              int temp = arr[j];
                              arr[j] = arr[i];
                              arr[i] = temp;
                        }
                  }
            }
            return arr;
      }


      static Boolean arrayEqualCheck(int arr1[] , int arr2[] , int N){


            sortArray(arr1);
            sortArray(arr2);


            for(int i=0; i< N; i++){
                 
                      if (arr1[i] != arr2[i]) {
                  return false;
                      }
  
            } return true;


      }

    

      public static void main(String[] args) {

           

          int  A[] = {6,2,5,4,0};
          int   B[] = {2,4,5,0,1 };
          int N = 5;

            A = sortArray(A);
            System.out.println("Sorted of A "+Arrays.toString(A));
            sortArray(B);
            B = sortArray(B);
            System.out.println("Sorted of B "+Arrays.toString(B));
    
            System.out.println(arrayEqualCheck(A, B, N));



           


            


            
      }

          

            


      }


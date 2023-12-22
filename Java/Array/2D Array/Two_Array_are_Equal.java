public class Two_Array_are_Equal {

      static long [] sortArray (long arr[]){

            for(int i = 0 ; i < arr.length ; i++){
                  for(int j = 0 ; j < arr.length ; j++){
                        if (arr[j] < arr[i]) {
                              long temp = arr[j];
                              arr[j] = arr[i];
                              arr[i] = temp;
                        }
                  }
            }
            return arr;
      }


      static boolean arrayEqualCheck(long arr1[] , long arr2[] , int N){

            sortArray(arr1);
            sortArray(arr2);


            for(int i=0; i< N; i++){
                  if (arr1[i] == arr2[i]){ {
                        return false;
                  }
                  
            }
            
      }return true;
      }

      public static void main(String[] args) {

          long  A[] = {1,2,5,4,0};
          long   B[] = {2,4,5,0,1};
          int N = 5;

            System.out.println(arrayEqualCheck(A, B, N));

      }
}

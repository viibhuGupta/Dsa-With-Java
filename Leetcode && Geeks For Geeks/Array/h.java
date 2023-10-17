public class h {

       //      here we are decelaring the array first and second
       public static int [] mergedArray (int arr1[] , int arr2[] ){

            //  now we are finding the minimum length of Array 1 and 2
            // we use math min class function
            int lengthArray = Math.min(arr1.length, arr2.length);

            //  now we craete a third Array that Store the length of both A and B array

            int arrFinal [] = new int [lengthArray * 2];

            // this loop is used to merged Array a and b
            //  now the i shourd be less than the length of (arrFinal) because the size of final array is the total of Array A and B

            for(int i =0 ; i < lengthArray ; i++ ){
                  /*  now this line of Code Assign the value of array A into finalArray for that we can Calculate like if we are on first index = 0 then do this
                   *
                   * i = 0
                   * i * 2  // here two we used because we want the Element of Array a should be on the even index of final Array
                   */

                   arrFinal [i * 2] = arr1[i];

                   /*  now this line of Code Assign the value of array B into finalArray for that we can Calculate like if we are on first index = 0 then do this
                   *
                   * i = 0
                   * i * 2 + 1 // here two + 1 we used because we want the Element of Array B should be on the Odd index of final Array
                   */

                   arrFinal [ i * 2 + 1] = arr2[i];


            }



            return arrFinal;

      }


      public static void main(String[] args) {

            int arr1 [] = {2,4,8,32,16,60,70,89,98};
            int arr2 [] = {3,7,9,30,35,24};

            //  now create the object to store the merged function

            int result [] = mergedArray(arr1, arr2);

      }

}

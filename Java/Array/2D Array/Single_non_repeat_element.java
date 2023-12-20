public class Single_non_repeat_element {
    public static void main(String[] args) {

        int arr[] = {1,1,3};
        int single = arr[0];

        for(int i = 1 ; i < arr.length; i++){
            
            single = single ^ arr[i];
        }

        System.out.println("Non Reapting Element In Array = "+single);
    }
}

public class First {
    public static void chnageToDecimal (){
        int num = 17;
        double doubleValueNum = (double) num; 
        System.out.printf("%.2f\n", doubleValueNum); 
    } 

    public static void chnageToDecimalusingString (){
        int num = 20;
        String decimalValue = num +".00"; 
        System.out.println(decimalValue);
    }
    public static void main(String[] args) {
       chnageToDecimal();
       chnageToDecimalusingString();
    }
}

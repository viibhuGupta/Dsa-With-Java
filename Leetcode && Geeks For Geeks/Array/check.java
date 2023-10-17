public class check {
      // Online Java Compiler
// Use this editor to write, compile and run your Java code online


      public static void main(String[] args) {
          String s = "Hello World";
  String f = "";
  for (int i = 0; i<s.length(); i++){
      if (s[i]==" "){
          System.out.println(f);
      }
      else if(s.length()>i+1){
          System.out.println(f);
      }
      else{
          f = f + s[i];
      }
    }  }

}

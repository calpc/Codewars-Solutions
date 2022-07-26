public class Accumul {
    
    public static String accum(String s) {
      String result = "" + Character.toUpperCase(s.charAt(0));
     for (int i = 1; i < s.length(); i++) {
       result += "-" + Character.toUpperCase(s.charAt(i));
       for (int j = 0; j < i; j++) {
         result += Character.toLowerCase(s.charAt(i));
       }
     }
      System.out.println(result);
      return result;
    }
}

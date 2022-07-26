class Solution {
  public static String camelCase(String input) {
    
    if (input == null) {
      return null;
    }
    
    String result = "";
    
    for (int i = 0; i < input.length(); i++) {
      if (Character.isUpperCase(input.charAt(i))) {
        result += " " + input.charAt(i);
        continue;
      }
      result += input.charAt(i);
    }
    
    return result;
    
  }
}

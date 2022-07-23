public class DRoot {
  public static int digital_root(int n) {
    if (n <= 9) {
      return n;
    } 
    
    // recursively calling on the result
    return digital_root(n % 10 + digital_root(n / 10));
  }
}

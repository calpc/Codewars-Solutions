public class SquareDigit {

  public int squareDigits(int n) {
    
    if (n == 0) {
      return 0;
    }
    
    String result = "";
    while (n != 0) {
      result = Integer.toString((n%10) * (n%10)) + result;
      n = n / 10;
    }
    return Integer.valueOf(result);
  }

}

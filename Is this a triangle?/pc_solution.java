class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    
    int min1 = a;
    int min2 = b;
    int remain= c;
    
    if (a > b) {
      min1 = b;
      
      if (a < c) {
        min2 = a;
      } else {
        min2 = c;
        remain = a;
      }
      
    } else if (b > c) {
        min2 = c;
        remain = b;
    }
    
    return min1 + min2 > remain;
    
  }
}

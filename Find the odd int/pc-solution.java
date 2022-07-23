import java.util.ArrayList;
public class FindOdd {
  public static int findIt(int[] a) {
    
    if (a.length == 1) {
      return a[0];
    }
    
    // store unique value in the array
    ArrayList<Integer> number = new ArrayList<Integer>();
    
    int odd = a[0];
    int times;
    
    for (int i = 0; i < a.length; i++) {
      
      if (!number.contains(a[i])) {
        number.add(a[i]);
        times = 0;
        
        for (int j = 0; j < a.length; j++) {
          if (a[i] == a[j]) {
            times ++;
          }
        }
        
        // check if the number has odd times 
        if (times % 2 != 0) {
          odd = a[i];
        } 
      }
    }
    return odd;
  }
}

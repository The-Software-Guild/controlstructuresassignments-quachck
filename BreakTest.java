public class BreakTest {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      int counter = 0;
      for (int j = i; j > 0; j--) {
        if (i % j == 0) {
          counter++;
        }
        if (counter > 2) {
          break;
        }
      }
      if (counter == 2) {
        System.out.println(i);
      }
    }
  }
}
public class ForLoopTest {
  public static void main(String[] args) {
    int x = -3;
    int factorial = 1;

    if (x > 0) {
      for (int i = x; i > 0; i--) {
        factorial *= i;
      }
    } else {
      for (int i = x; i < 0; i++) {
        factorial *= i;
        if (factorial > 0) {
          factorial *= -1;
        }
      }
    }
    System.out.println(factorial);
  }
}
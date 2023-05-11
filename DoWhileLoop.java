public class DoWhileLoop {
  public static void main(String[] args) {
    int curr = 1;
    int prev = 0;
    int next;
    int counter = 0;

    do {
      System.out.println(prev);
      next = curr + prev;
      prev = curr;
      curr = next;
      counter++;
    } while (counter < 10);
  }
}
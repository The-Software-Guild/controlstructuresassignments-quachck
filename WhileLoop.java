public class WhileLoop {
  public static void main(String[] args) {
    int num = 1251;
    String numAsStr = Integer.toString(num);
    int rightIndex = numAsStr.length() - 1;
    int leftIndex = 0;

    while (leftIndex < rightIndex) {
      if (numAsStr.charAt(leftIndex) != numAsStr.charAt(rightIndex)) {
        System.out.println(num + " is not a palindrome");
        return;
      }
      leftIndex++;
      rightIndex--;
    }
    System.out.println(num + " is a palindrome");
  }
}

public class SwitchCase {
  public static void main(String[] args) {
    char ch = 'd';

    switch (ch) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println(ch + " is a vowel");
        break;
      default:
        System.out.println(ch + " is not a vowel");
    }
  }
}
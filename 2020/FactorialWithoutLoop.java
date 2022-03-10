
public class FactorialWithoutLoop {
  static int calculateFactorial(int x) {
    if (x == 1) {
      return 1;
    } else {
      return x*calculateFactorial(x-1);
    }
  }

  public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);
      System.out.println(calculateFactorial(n));
  }
}
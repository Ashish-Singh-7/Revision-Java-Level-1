import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    scn.close();
    int d = toDecimal(n, b);
    System.out.println(d);
  }

  public static int toDecimal(int n, int b) {
    int power = 0, rv = 0;
    while (n > 0) {
      int remainder = n % 10;
      n = n / 10;
      rv += remainder * power;
      power*=b;
    }
    return rv;
  }
}
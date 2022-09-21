import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    System.out.println(getValueInBase(n, b));
    scn.close();
  }

  public static int getValueInBase(int n, int b) {
    int rv = 0;
    int power = 1;
    while (n > 0)
    {
      int remainder = n % b;
      n = n / b;
      rv = rv + remainder * power;
      power *= 10;
    }
    return rv;
  }
}
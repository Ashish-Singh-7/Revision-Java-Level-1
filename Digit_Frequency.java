import java.util.*;

public class Main {


public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int d = scn.nextInt();
int f = getDigitFrequency(n, d);
System.out.println(f);
}
public static int getDigitFrequency(int n, int d) {
int count = 0;

while (n > 0)
{
int digits = n % 10; // Extract Digits
n = n / 10; // Divide N by 10
if (digits == d) // Logic Applied
count++;
}
return count;
}
}


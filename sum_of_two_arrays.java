import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    
    int[] a1=new int[n1];
    for(int i=0;i<n1;i++)
    {
        a1[i]=scn.nextInt();
    }
    
    int n2=scn.nextInt();
    
    int[] a2=new int[n2];
    for(int j=0;j<n2;j++)
    {
        a2[j]=scn.nextInt();
    }
    
    int[] sum = new int[n1 > n2 ? n1 : n2];
    int i = n1 - 1;
    int j = n2 - 1;
    int k = sum.length - 1;
    int carry = 0;
    while (k>=0) {
      int digit = carry;

      if (i >= 0)
        digit += a1[i];

      if (j >= 0)
        digit += a2[j];

      carry = digit / 10;
      digit = digit % 10;
      sum[k] = digit;

      i--;
      j--;
      k--;
    }

    if (carry != 0) {
      System.out.println(carry);
    }
    for (int val : sum) {
      System.out.println(val);
    }
  }

}
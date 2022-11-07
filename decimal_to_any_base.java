import java.util.*;
public class decimal_to_any_base{

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt();
    int base = scn.nextInt();
    int result = getValueInBase(number, base);
    System.out.println(result);
    }
    
    public static int getValueInBase(int n, int b){
    // write code here
    
    int answer=0;int power=1;
    while(n>0)
    {
    int rem=n%b;
    n=n/b;
    answer=answer + rem * power;
    power*=10;
    }
    return answer;
    }
    }
import java.util.*;
public class gcd_and_lcm_of_a_number{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
 
        int org1=num1;
        int org2=num2;
        while(num1%num2!=0)
        {
            int rem=num1%num2;
            num1=num2;
            num2=rem;
        }
        int gcd=num2;
        int lcm=(org1*org2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
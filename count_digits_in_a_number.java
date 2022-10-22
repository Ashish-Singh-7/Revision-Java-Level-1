import java.util.*;
public class count_digits_in_a_number{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int dig=n%10;
        while(n!=0)
        {
            n=n/10;
            dig++;
        }
        System.out.println(dig);
    }
}
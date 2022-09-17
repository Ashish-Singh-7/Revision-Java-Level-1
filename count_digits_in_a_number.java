import java.util.Scanner;

public class count_digits_in_a_number{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int no_of_dig=0;
        while(n!=0)
        {
            n=n/10;
            nod++;
        }
        System.out.print(no_of_dig);
    }
}
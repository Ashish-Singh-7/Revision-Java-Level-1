import java.util.*;
public class practice_patterns8th{
    public static void main(String[] args){
        int number=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number+=1;
            }
            System.out.println();
        }
    }
}
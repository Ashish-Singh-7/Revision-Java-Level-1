import java.util.*;

public class practice{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int X=0;
        while(n-->=1)
        {
            String str=scn.next();
            if(str.charAt(0)=='X')
            {
                if(str.charAt(1)=='+')
                {
                    X++;
                }
                if(str.charAt(1)=='-')
                {
                    X--;
                }
            }
            else if(str.charAt(0)=='+')
            {
                ++X;
            }
            else
            {
                --X;
            }
        }
        System.out.println(X);
    }
}
import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        int len=str.length();
        if(len>10)
        {
            System.out.println(""+str.charAt(0)+(len-2)+str.charAt(len-1));
        }
        else{
            System.out.println(str);
        }
    }
}
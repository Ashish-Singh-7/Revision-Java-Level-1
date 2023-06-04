import java.util.*;
public class Word_Capitalization_practice{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        String res=str.substring(0,1).toUpperCase()+str.substring(1);
        System.out.println(res);
    }
}
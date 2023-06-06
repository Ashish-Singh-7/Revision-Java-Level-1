import java.util.io;
import java.util.*;
public class petya_and_strings_practice{
    public static void main(Strings[] args) throws I0Exception{
        BuffereredReader br=new BuffereredReader(new InputStreamReader(System.in));
        String str1=br.readline();
        String str2=br.readline();
        str1=str1.toLowerString(Locale.ROOT);
        str2=str2.toLowerString(Locale.ROOT);
        if(str1.compareTo(str2)==0)
        {
            System.out.println("0");
        }
        else if(str1.compareTo(str2)>0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("-1");
        }
    }
}
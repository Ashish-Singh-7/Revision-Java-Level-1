import java.util.*;
public class Helpful_Maths{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='+'){
                int n=s.charAt(i)-48;
                al.add(n);
            }
        }
        Collections.sort(al);
        for(int i=0;i<al.size();i++)
        {
            if(i!=al.size()-1)
                System.out.print(al.get(i)+"+");
            else 
                System.out.print(al.get(i));
        }
    }
}
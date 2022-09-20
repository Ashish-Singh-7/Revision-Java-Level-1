import java.util.*;

public class Main{

public static void main(String[] args) {
Scanner scn = new Scanner(System.in);

// write ur code here
int n=scn.nextInt();

int space=0;
int star=n;

for(int i=1;i<=n;i++)
{
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}

for(int j=1;j<=star;j++)
{
if(i>1 && i<=n/2 && j>1 && j<=n/2{
System.out.print(" ");
}
else
{
System.out.print("* ");
}
}


if(i<=n/2)
{
star-=2;
space++;
}
else
{
star+=2;
space--;
}
System.out.println();
}
}
}
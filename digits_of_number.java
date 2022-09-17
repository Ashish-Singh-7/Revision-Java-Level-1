public class digits_of_number{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int no_of_dig=0;
        int temp=n;
        while(temp!=0)
        {
            temp=temp/10;
            no_of_dig++;
        }
        int div=(int)Math.pow(10,no_of_dig-1);
        while(div!=0)
        {
            int q=n/div;
            System.out.println(q);

            n=n%div;
            div=div/10;
        }
    }
}
public class prime_factorization{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        for(int div=2;div*div<=n;div++)
        {
            while(n!=1)
            {
                n=n/div;
                System.out.println(div+" ");
            }
        }
        if(n!=1)
        {
            System.out.println(n);
        }
    }
}
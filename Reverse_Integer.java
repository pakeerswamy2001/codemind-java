import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r=0,rev=0;
        n=sc.nextInt();
        if(n>0)
        {
            while(n>0)
        {
           r=n%10;
           rev=rev*10+r;
           n=n/10;
        }
        System.out.println(rev);
        }
        else
        {
            n=-n;
            while(n>0)
        {
           r=n%10;
           rev=rev*10+r;
           n=n/10;
        }
        System.out.println(-rev);
        }
    }
}
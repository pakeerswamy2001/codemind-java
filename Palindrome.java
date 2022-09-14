import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int temp,n,sum=0,r;
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
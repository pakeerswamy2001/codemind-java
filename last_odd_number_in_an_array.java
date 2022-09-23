import java.util.Scanner;
class odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x[],c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            if(x[i]%2!=0)
            {
                c=x[i];
                break;
            }
        }
        System.out.println(c);
    }
}
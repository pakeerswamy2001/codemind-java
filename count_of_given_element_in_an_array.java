import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],c=0;
        n=sc.nextInt();
        x= new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            if(x[i]==k)
            {
              c++;  
            }
        }
        if(c>0)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println("0");
        }
    }
}
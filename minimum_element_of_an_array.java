import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        float avg;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int min=x[0];
        for(i=n-1;i>=1;i--)
        {
            if(x[i]<min)
            {
                min=x[i];
            }
        }
        System.out.println(min);
        }
    }

import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,count=0,k;
        n=sc.nextInt();
        k=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
          
        for(i=0;i<n;i++)
        {
              if(x[i]%k==0)
                count++;
        }
        System.out.println(count);
    }
}
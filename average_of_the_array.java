import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,s=0,c=0;
        float avg;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            s=s+x[i];
            c=c+1;
        }
        avg=(float)s/c;
        System.out.printf("%.2f",avg);
    }
}

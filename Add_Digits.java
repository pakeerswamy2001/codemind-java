import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,sum=0,r;
    n=sc.nextInt();
    while(n>0)
    {
        r=n%10;
        sum=sum+r;
        n=n/10;
        if(n==0&&sum>9)
        {
            n=sum;
            sum=0;
        }
        
        
    }
    System.out.println(sum);
    }   
}
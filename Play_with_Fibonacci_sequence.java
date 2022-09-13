import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       int a=0,b=1,n;
       n=sc.nextInt();
       System.out.print(a+" "+b+" ");
       for(int i=2;i<n;i++)
       {
       int sum=a+b;
       a=b;
       b=sum;
       System.out.print(sum+" ");
       }
     }
}
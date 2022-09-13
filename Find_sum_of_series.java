import java.util.Scanner;
class Square1
{
    public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       int n,i;
       n=sc.nextInt();
       float sum;
       sum=0;
       for(i=1;i<=n;i++)
       {
           sum=sum+((float)1/i);
       }
       System.out.format("%.2f",sum);
       sc.close();
     }
}
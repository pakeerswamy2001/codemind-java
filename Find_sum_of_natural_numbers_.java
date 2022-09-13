import java.util.Scanner;
class Square1
{
    public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       int n,i,sum;
       n=sc.nextInt();
       sum=0;
       
       for(i=1;i<=n;i++)
       {
           sum=sum+i;
       }
       System.out.println(sum);
       sc.close();
     }
}
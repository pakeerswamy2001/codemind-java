import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=b;i=i+2)
        {
            System.out.println(a+" x " +i+ " = " +a*i);
        }
    }
}
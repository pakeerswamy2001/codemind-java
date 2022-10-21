import java.util.Scanner;
class cts
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int F;
        float C;
        F=sc.nextInt();
        C=(float)((F-32)*5)/9;
        System.out.printf("%.2f",C);
    }
}

import java.util.Scanner;
class interest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t;
        double ci;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        ci=p*(Math.pow((1+r/100),t));
        System.out.format("%.2f",ci);
    }
}
import java.util.Scanner;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.nextLine().charAt(0);
        if(ch=='V'||ch=='v')
        {
            System.out.print("Violet");
        }
        else if(ch=='I'||ch=='i')
        {
            System.out.println("Indigo");
        }
        else if(ch=='B'||ch=='b')
        {
            System.out.println("Blue");
        }
        else if(ch=='G'||ch=='g')
        {
            System.out.println("Green");
        }
        else if(ch=='Y'||ch=='y')
        {
            System.out.println("Yellow");
        }
        else if(ch=='O'||ch=='o')
        {
            System.out.println("Orange");
        }
        else if(ch=='R'||ch=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println("-1");
        }
    }
}
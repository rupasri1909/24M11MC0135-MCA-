import java.util.Scanner;
class Simpleif{
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.println("Positive Number");
        }
        else if(a<0)
        {
            System.out.println("Negative NUMBER");
        }
        else
        {
            System.out.println("Zero number");
        }
    }
}
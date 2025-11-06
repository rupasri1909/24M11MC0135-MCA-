import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(index:0);
        switch(operator)
        {
            case'+':
            System.out.println("sum: "+(a+b));
            break;
            case'-':
            System.out.println("Difference: "+(a-b));
            break;
            case'*':
            System.out.println("product: "+(a*b));
            break;
            case'/':
            if(b>0)
            System.out.println("quotient: "+(a/b));
            else
            System.out.println("number cannot divisible by zero");
            break;
            case'%':
            if(b>0)
            System.out.println("Remainder: "+(a%b));
            else
            System.out.println()
            break;
        }
    }
}
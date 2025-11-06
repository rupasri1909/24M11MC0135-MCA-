//arithemetic 
// public class Operator{
//     public static void main(String args[]){
//         int a=10,b=60;
//         System.out.println("sum:"+(a+b));
//         System.out.println("difference:"+(a-b));
//         System.out.println("product:"+(a*b));
//         System.out.println("division:"+(b-a));
//         System.out.println("division:"+(b%a));
//     }
// }

//relational
// public class Operator{
//     public static void main(String args[]){
//         int a=10, b=20;
//         System.out.println("(a==b)"+(a==b));
//         System.out.println("(a>b)"+(a>b));
//         System.out.println("(a<b)"+(a<b));
//         System.out.println("(a>=b)"+(a>=b));
//         System.out.println("(a<=b)"+(a<=b));
//         System.out.println("(a!=b)"+(a!=b));

//     }
// }

// import java.util.Scanner;
// public class Operator{
//     public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the radius of the circle:");
//     double radius =sc.nextDouble();
//     double area=3.14 * radius *radius;
//     System.out.println("the area of a circle:"+area);
//     }
// }

// import java.util.Scanner;
// public class Operator{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the p value");
//         double p=sc.nextDouble();
//         System.out.println("enter the r value");
//         double r=sc.nextDouble();
//         System.out.println("enter the t value");
//         double t=sc.nextDouble();
//         double si=(p*r*t)/100;
//         System.out.println("the simple interst is:"+si);
//     }
// }

//logical 
// public class Operator{
//     public static void main(String args[]){
//         int a=10,b=20;
//         System.out.println(((a==b) &&(b>a)) );
//         System.out.println(((a!=10) &&(b>a)) );
//         System.out.println(((a==10) ||(b>a)) );
//          System.out.println(((a!=b) ||(b>a)) );
//          System.out.println((a!=b));

//     }
// }


//assignment
// public class Operator{
//     public static void main(String args[]){
//         int a=5;
//         System.out.println("(a+=2):"+(a+=2));
//         System.out.println("(a-=2):"+(a-=2));
//         System.out.println("(a*=2):"+(a*=2));
//         System.out.println("(a/=2):"+(a/=2));
//         System.out.println("(a%=2):"+(a%=2));
//     }
// }


//increment,decrement
// public class Operator{
//     public static void main(String args[]){
//         int a=4;
//         System.out.println("the value of a is:"+a);
//         System.out.println("(a++):"+(a++));
//         System.out.println("(a--):"+(a--));
//         System.out.println("(++a):"+(++a));
//         System.out.println("(--a):"+(--a));

//     }
// }


//turnary
// import java.util.Scanner;
// public class Operator{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a value:");
//         int num=sc.nextInt();
//         String res=(num%2==0)?"even":"odd";
//         System.out.println("the number is :" +res);
//     }

// }



// import java.util.Scanner;
// public class Operator{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a value:");
//         int num=sc.nextInt();
//         String res=(num>0)?"positive":"negative";
//         System.out.println("the number is:"+res);
//     }
// }


public class Operator{
    public static void main(String args[]){
        int a=10,b=5;
        System.out.println("a&b:"+(a&b));
        System.out.println("a|b:"+(a|b));
        System.out.println("a^b:"+(a^b));
        System.out.println("a<<2:"+(a<<2));
        System.out.println("a>>2:"+(a>>2));
        System.out.println("~a:"+(~a));
    }
}
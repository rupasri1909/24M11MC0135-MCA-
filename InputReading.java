import java.util.Scanner;
class InputReading{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        byte b=sc.nextByte();
        short s=sc.nextShort();
        int i=sc.nextInt();
        long l=sc.nextLong();
        String str1=sc.next();
        sc.nextLine();
        String str2=sc.nextLine();
        char c=sc.next().charAt(0);
        System.out.println(" entered byte value is:"+b);
        System.out.println("entered short value is:"+s);
        System.out.println("entered int value is:"+i);
        System.out.println("entered long value is:"+l);
        System.out.println("entered singleword value:"+str1);
        System.out.println("entered sentence value is:"+str2);
        System.out.println("entered char value is:"+c);


    }
}
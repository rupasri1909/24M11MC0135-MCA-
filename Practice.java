// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the hours:");
//         int hours=sc.nextInt();
//         int minutes=hours*60;
//         int seconds=hours*3600;
//         System.out.println("the minutes are:"+minutes);
//         System.out.println("the seconds are:"+seconds);
//  }
// }


// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the n value:");
//         int n=sc.nextInt();
//         int square=n*n;
//         int cube=n*n*n;
//         System.out.println("the square value is:"+square);
//         System.out.println("the cube value is:"+cube);
//     }
// }


// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter a value");
//         int a=sc.nextInt();
//         System.out.println("enter b value");
//         int b=sc.nextInt();
//         int remainder=a-(a/b)*b;
//         System.out.println("the remainder is:"+remainder);
// }
// }


import java.util.Scanner;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many days:");
        int d=sc.nextInt();
        int years=d/365;
        int weeks=(d % 365)/7;
        int days=(d % 365) /7; 
        System.out.println("the years is: "+years);
        System.out.println("the weeks are: "+weeks);
        System.out.println("the weeks are: "+days);
}
}


// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter how many small  are:");
//         int small=sc.nextInt();
//         System.out.println("enter how many medium are:");
//         int medium=sc.nextInt();
//         System.out.println("enter how many large  are:");
//         int large=sc.nextInt();
//         int total=(small*150)+(medium*200)+(large*250);
//         System.out.println("the total value is:"+total);

//     }
// }


// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter the recharge amount:");
//       int amount=sc.nextInt();
//       int GST=(amount*18)/100;
//       int talktime=amount-GST;
//       System.out.println("the talktime is:"+talktime); 
//     }
// }


// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the no.of students:");
//         int students=sc.nextInt();
//         System.out.println("enter the contribution:");
//         int contribution=sc.nextInt();
//         int total=contribution*students;
//         int average=total/ students;
//         System.out.println("the total is:"+total);
//         System.out.println("the average is:"+average);

// }
// }


// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the distance");
//         int distance=sc.nextInt();
//         System.out.println("enter the mileage");
//         int mileage=sc.nextInt();
//         System.out.println("enter the price per litre");
//         int priceperlitre=sc.nextInt();
//         int fuelused=distance/mileage;
//         int totalcost=fuelused*priceperlitre;
//         System.out.println("the total cost is:"+totalcost);
// }
// }



// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter how many minutes");
//         int minutes=sc.nextInt();
//         int hours=minutes/60;
//         int charges=hours*20;
//         System.out.println("the hours are:"+hours);
//         System.out.println("the charges are:"+charges);

//     }
// }


// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the no.of late days");
//         int latedays=sc.nextInt();
//         int fine=latedays*2;
//         System.out.println("the total fine is:"+fine);

//     }
// }


// import java.util.Scanner;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the spent amount of frnd1:");
//         int frnd1=sc.nextInt();
//         System.out.println("enter the spent amount of frnd2:");
//         int frnd2=sc.nextInt();
//         int total=frnd1+frnd2;
//         float f1=((float)frnd1/total)*100;
//         float f2=((float)frnd2/total)*100;
//         System.out.println("the total amount is:"+total);
//         System.out.println("the frnd1 paid amount:"+f1);
//         System.out.println("the frnd2 paid amount:"+f2);


//     }
// }
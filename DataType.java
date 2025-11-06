// class DataType{
//     public static void main(String args[])
//     {
//         byte b=1;
//         short s=23;
//         int i=2345;
//         long l=2345678;
//         char c='a';
//         float f=13.50f;
//         double d=24.7865;

//         System.out.println("the value of byte is:"+b);
//         System.out.println("the value of short is:"+s);
//         System.out.println("the value of int is:"+i);
//         System.out.println("the value of long is:"+l);
//         System.out.println("the value of char is:"+c);
//         System.out.println("the value of float is:"+f);
//         System.out.println("the value of double is:"+d);
//     }
// }


//instance variables
class DataType{
    byte b;
    String s;
    public static void main(String args[]){
        DataType obj1=new DataType();
        System.out.println("the value of byte is:"+obj1.b);
        obj1.b=23;
        System.out.println("the value of byte is:"+obj1.b);
        System.out.println("the value of byte is:"+obj1.s);
        obj1.s="2456";
        System.out.println("the value of byte is:"+obj1.s);

    }
}

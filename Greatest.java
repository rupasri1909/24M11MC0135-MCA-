public class Greatest{
    public static void main(String args[]){
        int a=10,b=8,c=7;
        int res=((a>b)?(a>c?a:c):(b>c?b:c));
        System.out.println("the highest number is:"+res);

    }
}
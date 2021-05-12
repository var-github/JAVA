public class Swap
{
    public static void main(){
        int x=5,y=10;
        System.out.println("\u000c");
        System.out.println("Before swap\n"+"x="+x+"\ny="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap\n"+"x="+x+"\ny="+y);
    }
}

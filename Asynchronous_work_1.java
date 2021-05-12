import java.util.Scanner;
public class Asynchronous_work_1
{
    public static void main(){
        Scanner x = new Scanner (System.in);
        System.out.println ("\u000c");
        System.out.println ("Enter your name");
        String n=x.next();
        System.out.println ("Enter your marks in computer science");
        float m = x.nextFloat();
        System.out.println ("\u000c");
        if(m>70){
            System.out.println ("Excelent work");
        }
        else{
            System.out.println ("You can do better next time");
        }
    }
}
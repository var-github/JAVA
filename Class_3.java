import java.util.Scanner;
public class Class_3
{
    public static void main(){
        Scanner x = new Scanner (System.in);
        System.out.println("\u000c");
        System.out.println("Enter your grade");
        int g=x.nextInt();
        if (g==10){
            System.out.println("You are in grade 10");
        }
        else{
            System.out.println("You are in grade "+g);
        }         
    }
}
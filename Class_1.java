import java.util.Scanner;
public class Class_1{
    public static void main(){
        Scanner x=new Scanner(System.in);
        char reply;
        do{
            System.out.println("\u000c");
            System.out.println("Enter temperature in the morning");
            float t1 = x.nextFloat();
            System.out.println("Enter temperature in the evening");
            float t2 = x.nextFloat();
            System.out.println("Enter temperature in the night");
            float t3 = x.nextFloat();
            float avg = (t1+t2+t3)/3;
            System.out.println("\u000c");
            System.out.println("Morning");
            System.out.println(t1+"F");
            System.out.println("");
            System.out.println("Evening");
            System.out.println(t2+"F");
            System.out.println("");
            System.out.println("Night");
            System.out.println(t3+"F");
            System.out.println("");
            System.out.println("Average temperature for the day is "+avg+"F");
            System.out.println("");
            System.out.println("Do you want to check again(y/n) ?");
            reply=x.next().charAt(0);
        }while (reply=='y'||reply=='Y');
        System.out.print("\u000c");
        System.out.println("You may exit the program now");
    }
}

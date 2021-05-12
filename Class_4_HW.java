import java.util.Scanner;
public class Class_4_HW
{
    public static void main(){
        Scanner x=new Scanner (System.in);
        char reply;
        do{
            System.out.println("\u000c");
            System.out.println("Enter time taken to complete the first trial round (in seconds)");
            float r1 = x.nextFloat();
            System.out.println("Enter time taken to complete the Second trial round (in seconds)");
            float r2 = x.nextFloat();
            System.out.println("Enter time taken to complete the third trial round (in seconds)");
            float r3 = x.nextFloat();
            float avg = (r1+r2+r3)/3;
            if (avg<10){
                System.out.println("Excellent");
                System.out.println("Qualified for the meet");
            }   
            else if (avg<12){
                System.out.println("Good try");
                System.out.println("Need to make more trials");      
            }
            else if (avg<14){
                System.out.println("Better luck next time");      
            }
            else {
                System.out.println("Invalid range");
            }
            System.out.println("");
            System.out.println("Do you want to check again (y/n)");
            reply = x.next().charAt(0);
        } while (reply == 'y'||reply == 'Y');
        System.out.println("\u000c");
        System.out.println("You may exit the program");
    }
}

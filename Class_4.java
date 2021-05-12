import java.util.Scanner;
public class Class_4
{
    public static void main(){
        Scanner x=new Scanner(System.in);
        char reply;
        do{
            System.out.println("\u000c");
            System.out.println("Enter which grade you are in");
            int grade=x.nextInt();
            if (grade==11||grade==12){
                System.out.println("Senior secondary");
                System.out.println("Csc - PYTHON");
            }
            if (grade==9||grade==10){
                System.out.println("Secondary school");
                System.out.println("Csc - JAVA");
            }
            if (grade==6||grade==7||grade==8){
                System.out.println("Junior school");
                System.out.println("Csc - Ms Office, HTML");
            }
            System.out.println("");
            System.out.println("Do you want to check again (y/n)");
            reply = x.next().charAt(0);
        } while (reply == 'y' || reply == 'Y');
    }
}
import java.util.Scanner;
public class Class_2 {
    public static void main(){
        Scanner x=new Scanner (System.in);
        System.out.println("\u000c");
        System.out.println("Enter your admission number");
        int ad= x.nextInt();
        /*x.nextLine();/* Without this when you hit enter it will take your
                      * name to be nothing because you hit enter
                      * (x.next line runs)*/
        System.out.println("Enter your name");
        String n= x.next();
        System.out.println("Enter your grade");
        int g= x.nextInt();
        System.out.println("Enter your section");
        char s= x.next().charAt(0);
        System.out.println("Enter your marks");
        float m= x.nextFloat();
        System.out.println("");
        System.out.println(n+" of class "+g+s+" has scored "+m+" marks");        
    }
}
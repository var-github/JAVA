/*In the do while loop first the program is executed then you check a condition using while statement.
 * If condition is true it will repeat what ever is in the do loop */
import java.util.Scanner;
public class do_while_loop {
    public static void main() {
        Scanner x = new Scanner(System.in);
        char reply;
        do{
            System.out.println("*** Product Price Check ***");
            System.out.print("Enter initial price: ");
            double price = x.nextDouble();
            System.out.print("Enter tax rate: ");
            double tax = x.nextDouble();
            price = price * (1 + tax/100);
            System.out.println("Cost after tax = " + price);
            // now see if user wants another go
            System.out.println();
            System.out.print("Would you like to enter another product(y/n)?: ");
            reply = x.next().charAt(0);
            System.out.println();
        } while (reply == 'y' || reply == 'Y');
    }
}
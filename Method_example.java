import java.util.Scanner;
/* This program demonstrates how methods can be used in a menu-driven programs(programs where you present a menu to the user)*/
public class Method_example{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double radius = -999; // initialize with a dummy value to show that nothing has been entered
        char choice; // to store menu choice
        do{
            System.out.println();
            System.out.println("*** CIRCLE CALCULATIONS ***");
            System.out.println();
            System.out.println("1. Enter the radius of the circle");
            System.out.println("2. Display the area of the circle");
            System.out.println("3. Display the circumference of the circle");
            System.out.println("4. Quit");
            System.out.println();
            System.out.println("Enter a number from 1 - 4");
            System.out.println();
            choice = keyboard.next().charAt(0);
            switch(choice){
                case '1' : radius = option1(); // call method option1
                break;
                case '2' : option2(radius); // call method option2
                break;
                case '3' : option3(radius); // call method option3
                break;
                case '4' : break;//break the loop
                default : System.out.println("Enter only numbers from 1 - 4");
                System.out.println();
            }
        } while(choice != '4');
    }
    static double option1(){  //metod for option1
        double myRadius; // local variable
        Scanner keyboard = new Scanner(System.in);//same variable name can be used as it is local
        System.out.print("Enter the radius of the circle: ");
        myRadius = keyboard.nextDouble();
        return myRadius;
    }
    //void because it dosnt have to return anything
    static void option2(double radiusIn){  //method for option2
        if(radiusIn == -999){
            System.out.println("Radius has not been entered");
        }
        else{
            double area;
            area = 3.1416 * radiusIn * radiusIn;
            System.out.println("The area of the circle is: " + area);
        }
    }
    static void option3(double radiusIn){  //method for option3
        if(radiusIn == -999){
            System.out.println("Radius has not been entered");
        }
        else{
            double circumference;
            circumference = 2 * 3.1416 * radiusIn;
            System.out.println("The circumference of the circle is: " + circumference);
        }
    }
}
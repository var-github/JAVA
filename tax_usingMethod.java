import java.util.Scanner;
public class tax_usingMethod{
    public static void main(){
        Scanner keyboard = new Scanner(System.in);
        double price, tax;
        System.out.println("*** Product Price Check ***");
        System.out.print("Enter initial price: ");
        price = keyboard.nextDouble();
        System.out.print("Enter tax rate: ");
        tax = keyboard.nextDouble();
        price = addTax(price, tax); // call the addTax method
        System.out.println("Cost after tax = " + price);
    }
    /*Here we type static and then method type(this will be the variable type of the return)
    We also have to specify what type the variables are.*/
    static double addTax(double priceIn, double taxIn){
        return priceIn * (1 + taxIn/100);
    }
}
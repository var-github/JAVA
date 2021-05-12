import java.util.Scanner;
public class more_aboutArrays{
    public static void main(){
        double[] temperature = new double[7];
        enterTemps(temperature); // In parameters we give only the name of the array(no type and size)
        displayTemps(temperature);
    }
    /* Here in the received parameters we have to specify type and name.
       Also in the if condition we have used the length of the Array(temperatureIn.length) as it gives the length of the array
       not the number of items in it(It is a constant as specified before).
       Also unlike variables the Arrays are not local, therefore even in the method we can change the contents of the array*/
    static void enterTemps(double[] temperatureIn){
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < temperatureIn.length; i++){
            System.out.println("enter max temperature for day " + (i+1));
            temperatureIn[i] = keyboard.nextDouble();
        }
    }
    static void displayTemps(double[] temperatureIn){
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println();
        for (int i = 0; i < temperatureIn.length; i++){
            System.out.println("day "+(i+1)+" "+ temperatureIn[i]);
        }
    }
}
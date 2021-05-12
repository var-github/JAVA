public class Varargs_variableArguments{
    public static void main(){
        double[] temperature = {7.5, 8.2, 7.7, 11.3, 10.75}; // create array with 5 readings
        System.out.println("Sending Array");
        displayTemps(temperature); // call method with a single array
        System.out.println();
        System.out.println("Sending individual items");
        displayTemps(7.5, 8.2, 7.7, 11.3, 10.75); // call method with 5 individual readings (not using the array)
        displayTemps(9.9); // call method with 1 value only (not using the array)
    }
    /* method to display temperatures using varargs - here if we send an array the program will work just like before
       But if we send a few values the varags syntax will convert it into an array(if we hadnt used varags it wont work as
       in the parameters we send a few values but in the method we are expecting an array)  */
    static void displayTemps(double... temperatureIn)
    {
        System.out.println();
        System.out.println("***TEMPERATURES***");
        System.out.println("Number of temperatures: "+ temperatureIn.length);
        for (int i = 0; i < temperatureIn.length; i++){
            System.out.println(temperatureIn[i]+ " ");
        }   
    }
}
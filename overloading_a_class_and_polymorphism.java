/*In this program there are 2 methods with the same name but different parameters(different number of variables). Therefore
  the 2 methods act differently. This is called overloading of a method or polymorphism.
  This is similar to overloading of division(/) - if you divide and store the answer in an integer the program ignores the
  decimal points. Similarly if you are dividing real numbers and store it in float or double the dicimals are included.  
*/
public class overloading_a_class_and_polymorphism{
    public static void main(){
        int maxOfTwo, maxOfThree;
        maxOfTwo = max(2, 10); // call the first version of max
        maxOfThree = max(-5, 5, 3); // call the second version of max
        System.out.println(maxOfTwo);
        System.out.println(maxOfThree);
    }
    // this version of max accepts two integers and returns the greater of the two
    static int max(int firstIn, int secondIn){
        if(firstIn > secondIn){
            return firstIn;
        }
        else{
            return secondIn;
        }
    }
    // this version of max accepts three integers and returns the greatest of the three
    static int max(int firstIn, int secondIn, int thirdIn){
        int result;
        result = firstIn;
        if(secondIn > result){
            result = secondIn;
        }
        if(thirdIn > result){
            result = thirdIn;
        }
        return result;
    }
}
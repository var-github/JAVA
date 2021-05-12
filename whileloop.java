//In while loop the condition is checked first. If condition is true then it will run
import java.util.Scanner;
public class whileloop {
    public static void main() {
        Scanner x = new Scanner(System.in);
        System.out.print("\u000c");
        System.out.println("How much did you get in your exam?");
        int mark = x.nextInt();
        while (mark < 0 || mark > 100){ // check if mark is invalid
            // display error message
            System.out.println("Invalid mark: please re-enter");
            mark = x.nextInt();
        }
        // by this point loop is finished and mark will be valid
        if (mark >= 40){
            System.out.println("Congratulations, you passed");
        }
        else{
            System.out.println("I'm sorry, but you failed");
        }
        System.out.println("Good luck with your other exams");
    }
}
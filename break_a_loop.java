import java.util.Scanner;
public class break_a_loop {
    public static void main(){
        Scanner x = new Scanner (System.in);
        final int SECRET = 27; // secret number. Use of final demarcates the number cant be changed
        int num;
        boolean guessed = false; // so far number not guessed
        System.out.println("You have 3 goes to guess the secret number");
        System.out.println("HINT: It is a number less than 50!");
        System.out.println();
        for (int i=1; i <= 3; i++){
            System.out.print("Enter guess: ");
            num = x.nextInt();
            if (num == SECRET)
            {
                guessed = true;
                break; /* Now the number has been guesed.
                          Therefore the loop dosnt need to run any more, so this will exit it.*/
            }
        }
        if (guessed){
            System.out.println("Number guessed correctly");
        }
        else{
            System.out.println("Number NOT guessed");
        }
    }
}
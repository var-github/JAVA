public class continue_a_loop {
    public static void main(){
        System.out.println("*** Even numbers from 10 to 1 ***");
        System.out.println();
        for(int i=10; i>=1; i--){
            if (i%2 != 0){ // this if loop will check if the number is odd            
                continue; /* If the number is odd then it will skip the rest
                             of this iteration and moves to the next iteration(it will start the loop again)*/
            }
            System.out.println(i); // even number only displayed if we have not skipped this iteration
        }
    }
}
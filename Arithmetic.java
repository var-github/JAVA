import java.util.Scanner;
class variable{

}
    

public class Arithmetic {
    public int sum, prod;
    public String name; 
    Arithmetic () {
        sum=0;
        prod=0;
        name="Ram";
    }
    int add (int i,int j) {
        sum = i+j;
        return sum;
    }
    int mult (int i,int j) {
        prod = i*j;
        return prod;
    }
    void display () {
        System.out.println("Name is s"+name);    
    }

    public static void main () {
        int sum = 0;
        int prd = 0;
        
        Arithmetic m = new Arithmetic();
        
        sum = m.add(1,3);
        prd = m.mult(3,2);
        
        System.out.println("Total is "+sum);    
        System.out.println("Product is "+prd);       
        m.display();
    }
}
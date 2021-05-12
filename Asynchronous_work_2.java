import java.util.Scanner;
public class Asynchronous_work_2
{
    public static void main(){
        Scanner x = new Scanner (System.in);
        System.out.println ("\u000c");
        System.out.println ("Enter number of chocolates purchased");
        int n=x.nextInt();
        System.out.println ("Enter the price for each chocolate");
        float p=x.nextFloat();
        float cost = n*p;
        double t,d=0;
        String c="";
        if(cost>50){
            d=0.02*cost;
            t=cost-d;
            c= "(2%)";
        }
        else{
            t=cost;
            c= "(0%)";
        }
        System.out.println ("\u000c");
        System.out.println ("   No of chocolates :        "+n);
        System.out.println ("   Price of each chocolate : "+p);
        System.out.println ("   Discount"+c+" :            "+d);
        System.out.println ("------------------------------------  ");
        System.out.println ("Total price :                "+t);
    }
}
import java.util.Scanner;
public class Comp_Simple_intrest
{
    public static void main(){
        Scanner x=new Scanner(System.in);
        System.out.println("\u000c");
        System.out.println("Enter the CI/SI");
        String z=x.next();
        if(z.equals("SI")){
            System.out.println("Enter the principle amount in rupees");
            int p=x.nextInt();
            System.out.println("Enter the time in years");
            int t=x.nextInt();
            System.out.println("Enter the rate of intrest for 1 year");
            int r=x.nextInt();
            int si=((p*t*r)/100);
            System.out.println("\u000c");
            System.out.println("Principle amount = "+p+" Rupees");
            System.out.println("Time = "+t+" years");
            System.out.println("Rate of intrest = "+r+"%");
            System.out.println("Simple intrest = "+si);
        } 
        else if(z.equals("CI")){
            float i=1,temp =0;
            System.out.println("Enter the principle amount in rupees");
            int p=x.nextInt();
            System.out.println("Enter the time in years");
            float t=x.nextFloat();
            System.out.println("Enter the rate of intrest for 1 year");
            float r=x.nextFloat();
            temp = (float)Math.pow((1+(r/100)),t);
            double a =((float)p * temp); 
            double ci =((float)a-p);
            System.out.println("\u000c");
            System.out.println("Principle amount = "+p+" Rupees");
            System.out.println("Time = "+t+" years");
            System.out.println("Rate of intrest = "+r+"%");
            System.out.print("Amount = ");
            System.out.printf("%.2f",a);
            System.out.print("\nCompound intrest = ");
            System.out.printf("%.2f",ci);
        }
    }
}

import java.util.Scanner;
public class Area
{
    public static void main(){
        Scanner x=new Scanner(System.in);
        System.out.println("\u000c");
        System.out.println("Enter which shape(in small letter)");
        String shape=x.next();        
        double area=0;
        if(shape.equals("square")){
            System.out.println("What is the measure of 1 side?");
            double s=x.nextDouble();
            area=s*s;
            System.out.println("\u000c");
            System.out.println("s = "+s);
        }
        else if(shape.equals("rectangle")){
            System.out.println("What is the length?");
            double l=x.nextDouble();
            System.out.println("What is the breadth?");
            double b=x.nextDouble();
            area=l*b;
            System.out.println("\u000c");
            System.out.println("l = "+l);
            System.out.println("b = "+b);
        }
        else if(shape.equals("circle")){
            System.out.println("What is the radius?");
            double r=x.nextDouble();
            area=2*3.14*(r*r);
            System.out.println("\u000c");
            System.out.println("r = "+r);            
        }
        else if(shape.equals("triangle")){
            System.out.println("What is the height?");
            double h=x.nextDouble();
            System.out.println("What is the length of the base?");
            double b=x.nextDouble();
            area=((b*h)/2);
            System.out.println("\u000c");
            System.out.println("h = "+h);    
            System.out.println("Length of base(b) = "+b);  
        }
        else if(shape.equals("trapezium")){
            System.out.println("What is the height?");
            double h=x.nextDouble();
            System.out.println("What is the length of the first parallel side?");
            double l1=x.nextDouble();
            System.out.println("What is the length of the second parallel side?");
            double l2=x.nextDouble();
            area=(((l1+l2)/2)*h);
            System.out.println("\u000c");
            System.out.println("h = "+h);    
            System.out.println("Length of the first parallel side = "+l1);  
            System.out.println("Length of the second parallel side = "+l2);  
        }
        else if(shape.equals("parallelogram")){
            System.out.println("What is the height?");
            double h=x.nextDouble();
            System.out.println("What is the length of the base(b)?");
            double b=x.nextDouble();            
            area=(b*h);
            System.out.println("\u000c");
            System.out.println("h = "+h);    
            System.out.println("b = "+b);               
        }
        System.out.println("Area = "+area);
    }
}
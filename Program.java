import java.util.Scanner;
public class Program {
    public static void main(){
        Scanner x=new Scanner(System.in);
        int numberOfFactors=0,highestFactor=0;
        int z=0;
        int number=0;
        String allFactors="";
        System.out.println("\u000c");
        System.out.println("Once you type upto which number");
        System.out.print("The program will check the number of factors each number has(upto the number you type)");
        System.out.println(" and will tell you which number/numbers");
        System.out.println("have the highest number of factors");
        System.out.println("");
        System.out.println("Upto which number would you like to check");
        int a=x.nextInt();
        while(a<0){
            System.out.println("Please enter a positive number");
            a=x.nextInt();
        }
        for(z=1;z<=a;z++){
            numberOfFactors=0;
            for(int i=2;i<=((z/2)+1);i++){  
                if(z%i==0){
                    numberOfFactors+=1;
                }
            }
            if(z!=1||z!=2){
                numberOfFactors+=2;
            }
            if(z==1){
                numberOfFactors=1;
            }
            if(z==2){
                numberOfFactors=2;
            } 
            if(numberOfFactors>highestFactor){
                highestFactor=numberOfFactors;
                number=z;
                allFactors=""+z;
            }
            if(numberOfFactors==highestFactor && z!=number){                
                allFactors=allFactors+","+z;
            }
        }
        System.out.println("\u000c");
        System.out.println(allFactors+" has "+highestFactor+" factors");
    }
}
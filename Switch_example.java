import java.util.Scanner;
public class Switch_example
{
    public static void main(){
       Scanner x=new Scanner(System.in); 
       System.out.println("\u000c");
       System.out.println("What do you want to find :-(Type the row number)");
       System.out.println("1.Number of days in a year");
       System.out.println("2.Number of days in a month");
       System.out.println("3.Number of week days in a year");
       int opt=x.nextInt();
       if (opt==1){
           System.out.println("Which year ?");
           int year=x.nextInt();           
           if((String.valueOf(year).substring(2)=="00")){
               if(year % 400==0){
                   System.out.println("366 days");
                }
            }
            else if(year % 4==0){
                System.out.println("366 days");
            }
            else{
                System.out.println("365 days");
            }          
           }
    }
}
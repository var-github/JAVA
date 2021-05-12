import java.util.Scanner;
public class Array_example{
    public static void main(){
        Scanner x=new Scanner(System.in);
        /*the words anArray is the name of the array and can be changed to anyting. Equall to new int[6] means that the list is
          made of only integers and list length is 6.*/
        int [] anArray = new int[6];
        //declares all the items in the list 
        anArray[0]=100;
        anArray[1]=200;
        anArray[2]=300;
        anArray[3]=400;
        anArray[4]=500;
        anArray[5]=600;
        System.out.println("\u000c");
        System.out.println("Enter the index of the item (below 6)");
        int n=x.nextInt();
        System.out.println("\u000c");
        System.out.println("Item with index "+n+" is "+anArray[n]);
    }
}
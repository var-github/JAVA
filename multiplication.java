import java.util.Scanner;
public class multiplication
{
    public static void main () {
        Scanner x =new Scanner (System.in);
        System.out.println ("\u000c");
        System.out.println ("Enter the order");
        String mat=x.next();
        int y=0,c=0,run=1,m,n,m1,n1;
        for(c=1;mat.charAt(c)!='*';c++){
            y=c;
        }
        String a ="",b="";
        for (c=0;c<=y;c++){
            a=a+mat.charAt(c);
        }
        c=y+2;
        for (;c<=(mat.length()-1);c++){
            b=b+mat.charAt(c);
        }
        m1=Integer.parseInt(a);
        n1=Integer.parseInt(b);  
        int [] anArray = new int[m1*n1];
        int w=0;
        for(c=1;c<=m1;c++){
            System.out.println("\u000c");
            System.out.println ("Row "+c);
            for(y=1;y<=n1;y++){
                System.out.println ("Column "+y);
                anArray[w]=x.nextInt();
                w=w+1;
            } 
        }
        if(run==1){
            m=m1;
            n=n1;
        }
        System.out.println("\u000c");
        w=0;
        for(y=1;y<=m1;y++){
            for(c=0;c<=(n1-1);c++){
                System.out.print(anArray[w]+"  ");
                w=w+1;
            }
            System.out.println("");            
        }        
    }    
}
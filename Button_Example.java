import javax.swing.JButton;  
import javax.swing.JFrame;  
//buttons can only be added on a frame, panel,etc
public class Button_Example {
     public static void main() {  
        /* JFrame is a top level container (window)
         * where we would be adding our button
         */
        JFrame frame=new JFrame();
        // Creating Button with string
        JButton b=new JButton("Button 1");
        /* Button with icon
         * JButton button = new JButton(new ImageIcon("file path"));
          
         * Button with text and icon
         * JButton button = new JButton("Start", new ImageIcon("file path"));
         
         * This method specifies the location and size
         * of button. In method setBounds(x, y, width, height)
         * x,y are cordinates from the top left
         */
        b.setBounds(50,50,100,40);
        //Adding button onto the frame
        frame.add(b);
        // Setting Frame size. This is the window size
        frame.setSize(500,500);
        //Extra
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
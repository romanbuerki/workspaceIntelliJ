import javax.swing.*;
import java.awt.*;

/**
 * Created by Roman on 07.04.2014.
 */
public class MyFrame extends JFrame{

    public static int y = 500;
    public static int x = 500;
    public JFrame mainFrame = new JFrame();




    public MyFrame()
    {
        mainFrame.setSize(x, y);
        mainFrame.setVisible(true);
    }



    public void paint()
    {
        while(true) {
            Letter let1 = new Letter('A', 300, this);
            mainFrame.add(let1.label);
            repaint();
            int i = let1.label.getX();
            i += 5;
            let1.label.setLocation(i, let1.label.getY());
        }
    }





}

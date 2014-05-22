import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Roman on 07.04.2014.
 */
public class Letter extends JFrame implements Runnable{

    public int tempo;
    public char letter;
    public int x;
    public int y;
    private Color color;
    public JLabel label;
    public MyFrame mainFrame;

    public Letter(char letter, int x, MyFrame mainFrame)
    {
        this.letter = letter;
        this.mainFrame = mainFrame;
        y = 0;
        this.x = x;
        String test = Character.toString(this.letter);
        label = new JLabel(Character.toString(this.letter));
        label.setLocation(x,y);
        mainFrame.add(label);
        label.setVisible(true);


    }

    public void run()
    {
        Dimension asfd = new Dimension(x, y);
        while(asfd.getWidth() <= 500)
        {
            this.x += 5;
            this.label.setLocation(this.x, this.y);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}

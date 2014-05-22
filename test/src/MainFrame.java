

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Roman on 10.04.2014.
 */
public class MainFrame extends JFrame {

    JFrame frame = new JFrame();
    public MainFrame(){

        JButton button = new JButton();
        JPanel panel1 = new JPanel();
        panel1.add(button);
        button.setSize(80,100);
        button.setText("Press Me");
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hallo du Seppli");
            }
        });

        frame.add(panel1, BorderLayout.PAGE_END);
        frame.setVisible(true);

    }


    public static void main(String[] args)
    {
        new MainFrame();
    }

}

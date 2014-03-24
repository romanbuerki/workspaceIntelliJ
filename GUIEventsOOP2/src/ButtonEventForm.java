import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;


/**
 * Created by Roman on 24.03.2014.
 */
public class ButtonEventForm extends JFrame{




    JTextField textfield1 = new JTextField();
public ButtonEventForm()
{
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GridLayout layout = new GridLayout(100,100);
    this.setLayout(layout);
    setTitle("Testprojekt");
    JButton button1 = new JButton();
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ButtonClick();
        }
    });
    button1.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
                    textfield1.setText("Verpiss dich");
        }

        @Override
        public void mouseExited(MouseEvent e) {
                    textfield1.setText("Sägi doch!");
        }
    });

    button1.setForeground(Color.RED);

    this.add(button1);
    this.add(textfield1);
    pack();
    setVisible(true);

}

    public void ButtonClick()
    {

        textfield1.setText("HDF");

    }

}

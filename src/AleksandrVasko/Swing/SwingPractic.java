package AleksandrVasko.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingPractic implements ActionListener {
   public static JButton button;
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("qwe");
    }
void go(){

    JFrame jframe = new JFrame();
    button = new JButton("кнопка");
    jframe.getContentPane().add(button);
    jframe.setSize(300,300);
    jframe.setVisible(true);
    button.setSize(100,70);
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    button.addActionListener(this);
    JLabel lable = new JLabel();
    lable.setSize(100,100);
    jframe.getContentPane().add(lable);
}

    public static void main(String[] args) {
        SwingPractic swg = new SwingPractic();
swg.go();
    }
}

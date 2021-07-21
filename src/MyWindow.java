import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow(){
        setVisible(true);
        setLocation(550 ,300);
        setSize(300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel penel = new JPanel(new GridLayout(1,2));

        JButton btn1 = new JButton("Выход");
        ActionListener listener = new  CloseActionListener();
        btn1.addActionListener(listener);

        penel.add(btn1);
        JButton btn2 = new JButton("Кнопка 2");
        penel.add(btn2);
        add(penel,BorderLayout.SOUTH);
    }
}

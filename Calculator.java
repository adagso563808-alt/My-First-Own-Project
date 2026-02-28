import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Another_Practice {
   
    public static void main(String[] args){
        
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
            
        });
    }
}

class Frame extends JFrame{
    
    JTextField textNumber;
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
    JButton plus, minus, times, divide, subtract, equal;
    
    public Frame(){
        
        setSize(400, 400);
        setTitle("Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        
        textNumber = new JTextField();
        button1 = new JButton();
        button1.setFocusPainted(false);
        button2 = new JButton();
        button2.setFocusPainted(false);
        button3 = new JButton();
        button3.setFocusPainted(false);
        button4 = new JButton();
        button4.setFocusPainted(false);
        button5 = new JButton();
        button5.setFocusPainted(false);
        button6 = new JButton();
        button6.setFocusPainted(false);
        button7 = new JButton();
        button7.setFocusPainted(false);
        button8 = new JButton();
        button8.setFocusPainted(false);
        button9 = new JButton();
        button9.setFocusPainted(false);
        button0 = new JButton();
        button0.setFocusPainted(false);
        divide = new JButton();
        divide.setFocusPainted(false);
        plus = new JButton();
        plus.setFocusPainted(false);
        minus = new JButton();
        minus.setFocusPainted(false);
        subtract = new JButton();
        subtract.setFocusPainted(false);
        times = new JButton();
        times.setFocusPainted(false);
        equal = new JButton();
        equal.setFocusPainted(false);
        
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(4, 2, 0, 2);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        
        textNumber.setText("0");
        textNumber.setHorizontalAlignment(JTextField.TRAILING);
        textNumber.setFont(new Font("Serif", 1, 24));
        textNumber.setEditable(false);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        add(textNumber, gbc);
        
        gbc.gridwidth = 1;
        
        button7.setText("7");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(button7, gbc);

        button8.setText("8");
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(button8, gbc);
        
        button9.setText("9");
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(button9, gbc);
        
        divide.setText("/");
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(divide, gbc);
        
        button4.setText("4");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(button4, gbc);

        button5.setText("5");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(button5, gbc);
        
        button6.setText("6");
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(button6, gbc);
        
        times.setText("*");
        gbc.gridx = 3;
        gbc.gridy = 2;
        add(times, gbc);
        
        button1.setText("1");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(button1, gbc);

        button2.setText("2");
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(button2, gbc);
        
        button3.setText("3");
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(button3, gbc);
        
        minus.setText("-");
        gbc.gridx = 3;
        gbc.gridy = 3;
        add(minus, gbc);
        
        button0.setText("0");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(button0, gbc);
        
        gbc.gridwidth = 1;
        
        equal.setText("=");
        gbc.gridx = 2;
        gbc.gridy = 4;
        add(equal, gbc);
        
        plus.setText("+");
        gbc.gridx = 3;
        gbc.gridy = 4;
        add(plus, gbc);
        
        
    }
}

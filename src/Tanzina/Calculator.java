package Tanzina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    JFrame f;
    JPanel panel1,panel2,panel3;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    double n1;
    double n2;
    double result;
    String Op;
    String Ans;

    Calculator()
    {
     JFrame f=new JFrame("Calculator");

//1st Jpanel

     panel1=new JPanel(new GridLayout());
     panel1.setBounds(15,10,310,60);
     t =new JTextField();
     t.setBounds(18,15,280,40);
//2nd Jpanel

      panel2=new JPanel(new GridLayout(4,3,10,10));
      panel2.setBounds(15,80,220,250);

        b1=new JButton("0");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b1.getText();
                t.setText(EnterNumber);
            }
        });

        b2=new JButton("1");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b2.getText();
                t.setText(EnterNumber);
            }
        });

        b3=new JButton("2");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b3.getText();
                t.setText(EnterNumber);
            }
        });
         b4=new JButton("3");
         b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b4.getText();
                t.setText(EnterNumber);
            }
        });
        b5=new JButton("4");
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b5.getText();
                t.setText(EnterNumber);
            }
        });
        b6=new JButton("5");
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b6.getText();
                t.setText(EnterNumber);
            }
        });
         b7=new JButton("6");
         b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b7.getText();
                t.setText(EnterNumber);
            }
        });
        b8=new JButton("7");
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b8.getText();
                t.setText(EnterNumber);
            }
        });
        b9=new JButton("8");
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b9.getText();
                t.setText(EnterNumber);
            }
        });
        b10=new JButton("9");
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b10.getText();
                t.setText(EnterNumber);
            }
        });

        b11=new JButton(".");
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(! t.getText().contains("."))
                {
                    t.setText(t.getText() + b11.getText());
                }
            }
        });

        b12=new JButton("00");
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = t.getText() + b12.getText();
                t.setText(EnterNumber);
            }
        });


//3rd Jpanel

      panel3=new JPanel(new GridLayout(7,1,5,5));
      panel3.setBounds(250,80,70,250);


        b13=new JButton("+");
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(t.getText());
                t.setText("");
                Op="+";
            }
        });

        b14=new JButton("-");
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(t.getText());
                t.setText("");
                Op="-";
            }
        });
        b15=new JButton("%");
        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(t.getText());
                t.setText("");
                Op="%";
            }
        });
        b16=new JButton("/");
        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(t.getText());
                t.setText("");
                Op="/";
            }
        });
        b17=new JButton("*");
        b17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(t.getText());
                t.setText("");
                Op="*";
            }
        });

        b18=new JButton("=");
        b18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            n2 = Double.parseDouble(t.getText());

                if(Op == "+")
                {
                    result = n1+n2;
                    Ans = String.format("%.2f", result);
                    t.setText(Ans);
                }

                if(Op == "-")
                {
                    result = n1-n2;
                    Ans = String.format("%.2f", result);
                    t.setText(Ans);
                }

                if(Op == "%")
                {
                    result = n1 % n2;
                    Ans = String.format("%.2f", result);
                    t.setText(Ans);
                }
                if(Op == "/")
                {
                    result = n1 / n2;
                    Ans = String.format("%.4f", result);
                    t.setText(Ans);
                }

                if (Op == "*")
                {
                    result = n1 * n2;
                    Ans = String.format("%.2f", result);
                    t.setText(Ans);
                }
            }
        });
        b19=new JButton("Clear");
        b19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(null);
            }
        });
        //Add TextField in 1st JPanel

         panel1.add(t);

        //Add Button in 2nd JPanel

         panel2.add(b1);
         panel2.add(b2);
         panel2.add(b3);
         panel2.add(b4);
         panel2.add(b5);
         panel2.add(b6);
         panel2.add(b7);
         panel2.add(b8);
         panel2.add(b9);
         panel2.add(b10);
         panel2.add(b11);
         panel2.add(b12);

//Add Button in 3rd JPanel

         panel3.add(b13);
         panel3.add(b14);
         panel3.add(b15);
         panel3.add(b16);
         panel3.add(b17);
         panel3.add(b18);
         panel3.add(b19);

// Three JPanel add JFrame

     f.add(panel1);
     f.add(panel2);
     f.add(panel3);

     f.setSize(350,380);
     f.setResizable(false);
     f.setLocationRelativeTo(null);
     f.setLayout(null);
     f.setVisible(true);

    }

}



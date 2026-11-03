/*11249A368

Aim:To write a Java program to demonstrate CardLayout using buttons.
Algorithm:
1.Start the program.
2.Create an Applet and implement ActionListener.
3.Create a Panel and CardLayout.
4.Add three buttons to the panel.
5.Register ActionListener for each button.
6.Use next() to display the next button when clicked.
7.Stop the program.*/
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}
/*Result
Thus, the Java CardLayout program was successfully executed.*/



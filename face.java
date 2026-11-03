/*11249a368
Aim
To write a Java program to draw a human face using Graphics methods.

Algorithm
Start the program.

Import the required Java packages.

Create an Applet class named face.

Use the paint() method to draw the face.

Use drawOval() to draw the face, eyes and ears.

Use fillOval() to draw the pupils.

Use fillArc() to draw the nose and mouth.

Display the face.

Stop the program.*/
import java.awt.*;
import java.io.*;
import java.applet.*;

public class face extends Applet
{
   /*
<applet code="face.class" width="300" height="300">
</applet>
*/ public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}
/*Result
Thus, the Java program to draw a human face using Graphics methods was successfully executed.*/

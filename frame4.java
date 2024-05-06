
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame4 {
    public static void m1 ()
    {
        JFrame f3= new JFrame("CAR SERVICE CENTER");
        f3.setSize(900,700);
        f3.setResizable(false);
        f3.setLocation(0,0);

        f3.setVisible(true);
        Color c1 = new Color(253, 238, 222);
        Container c3=f3.getContentPane();
        c3.setLayout(null);
        c3.setBackground(c1);
        f3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //-----------------------------------------------------
        JLabel fj1=new JLabel("YOUR PAYMENT SUCCESSFULLY!!");
        fj1.setBounds(300,90, 700,30);
        Font font1=new Font("Arial",Font.PLAIN,18);
        fj1.setFont(font1);
        c3.add(fj1);
        JLabel labe1 = new JLabel(); //JLabel Creation
        labe1.setIcon(new ImageIcon("pf.png")); //Sets the image to be displayed as an icon
        Dimension size = labe1.getPreferredSize(); //Gets the size of the image
        labe1.setBounds(200, 150, size.width, size.height); //Sets the location of the image
        //----------------------------------------------------------------
        c3.add(labe1);



    }
}

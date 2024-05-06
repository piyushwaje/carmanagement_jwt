import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.concurrent.TimeUnit;

class myframe extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JComboBox dd,mm,yy;
    JTextField t1,t2,t3,tc1,tc2;
    JTextArea a1;
    JLabel jm1,jm2,jm3;
    myframe()
    {
        JFrame f= new JFrame("CAR SERVICE CENTER");
        f.setSize(900,700);

        f.setLocation(0,0);
        Color c1 = new Color(253, 238, 222);

        f.setResizable(false);
        Container c=f.getContentPane();
        c.setLayout(null);
        c.setBackground(c1);
        //-----------------------------------------------------

        l1=new JLabel("GALAXY CAR SERVICE CENTER INFORMATION SYSTEM ");
        l1.setBounds(90,50, 700,30);
        Font font=new Font("Arial",Font.BOLD,25);
        l1.setFont(font);
        c.add(l1);
        //-----------------------------------------------------
        l2=new JLabel("Date:");
        Font font1=new Font("Arial",Font.PLAIN,18);
        l2.setFont(font1);
        l2.setBounds(50,100,200,40);
        c.add(l2);
        //-------------------------------------------------------
        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("mc.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(0, 200, size.width, size.height); //Sets the location of the image

        c.add(label);
        //---------------------------------------------------------
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String  date1=formatter.format(date);
        JLabel dd = new JLabel(date1 );


        dd.setBounds(50,130, 300,35);
        c.add(dd);
        //String [] days={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        //String months [] ={"Jan", "Eeb" , "Mar", "Apr", "May ", "Jun", "July" , "Aug", "Sen", "Oct ", "Nov", "Dec"} ;
        //String years[]={"2022","2021","2020","2019","2018", "2017","2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005",
               // "2004", "2003" , "2002", "2001", "2000", "1999", "1998"};
        //dd=new JComboBox(days);
       // mm=new JComboBox(months);
        //yy=new JComboBox(years);

        //mm.setBounds(100,130, 80,35);
        //yy.setBounds(170,130, 90,35);

        //c.add(mm);
       // c.add(yy);
        //---------------------------------------------------------
        l4=new JLabel("CUSTOMER DETAILS");
        Font font2=new Font("Arial",Font.BOLD,20);
        l4.setFont(font2);
        l4.setBounds(500,130,300,30);
        c.add(l4);
        //---------------------------------------------------------
        l3=new JLabel("NAME :");
        l3.setFont(font1);
        l3.setBounds(400,200,200,30);
        c.add(l3);

        //---------------------------------------------------------
        t1=new JTextField();
        t1.setBounds(500,200,300,30);
        c.add(t1);
        //String na1 = t1.getText();
        //String naq1=String.valueOf(na1);

        //frame4 ew =new frame4();
        //ew.bill(na1);




        //---------------------------------------------------------
        l5=new JLabel("ADDRESS :");
        l5.setFont(font1);
        l5.setBounds(400,240,200,30);
        c.add(l5);

        //---------------------------------------------------------
        a1=new JTextArea();
        a1.setBounds(500,240, 300,35);
        c.add(a1);

        //---------------------------------------------------------
        l6=new JLabel("EMAIL ID:");
        l6.setFont(font1);
        l6.setBounds(400,290,200,30);
        c.add(l6);
        //---------------------------------------------------------
        t2=new JTextField();
        t2.setBounds(500,290,300,30);
        c.add(t2);

        //---------------------------------------------------------
        l7=new JLabel("PHONE NO:");
        l7.setFont(font1);
        l7.setBounds(400,320,500,30);
        c.add(l7);
        //---------------------------------------------------------
        t3=new JTextField();
        t3.setBounds(500,320,300,30);
        c.add(t3);
        t3.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = t3.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()  == KeyEvent.VK_BACK_SPACE) {
                    t3.setEditable(true);

                } else {
                    t3.setEditable(true);
                    t3.setForeground(Color.black);
                    t3.setText("* Enter only numeric digits(0-9)");


                }
            }
        });
        //---------------------------------------------------------
        jm1=new JLabel("MECHANICAL DETAILS ");
        jm1.setFont(font2);
        jm1.setBounds(500,370,400,30);
        Color cw=new Color(0x481E1E);
        jm1.setForeground(cw);
        c.add(jm1);
        //---------------------------------------------------------
        jm2=new JLabel("NAME :");
        jm2.setFont(font1);
        jm2.setBounds(400,430,200,30);
        c.add(jm2);

        //---------------------------------------------------------
        tc1=new JTextField();
        tc1.setBounds(500,430,300,30);
        c.add(tc1);

        //---------------------------------------------------------
        jm3=new JLabel(" ID:");
        jm3.setFont(font1);
        jm3.setBounds(400,460,200,30);
        c.add(jm3);
        //---------------------------------------------------------
        tc2=new JTextField();
        tc2.setBounds(500,460,300,30);
        c.add(tc2);

        //---------------------------------------------------------
        JButton b=new JButton("ENTER");
        b.setBackground(Color.decode("#845F23"));
        b.setForeground(Color.white);
        b.setOpaque(true);
        b.setBorderPainted(false);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        b.setBounds(500,560,200,60);
        c.add(b);
        //---------------------------------------------------------
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                //frame2 f23=new frame2();
                String na1 = t1.getText();
                String na2= a1.getText();
                String na3= t2.getText();
                String na4= t3.getText();
                String na5= tc1.getText();
                String na7= tc2.getText();
                String na7dd=date1;

                String naq1=String.valueOf(na1);
                String naq2=String.valueOf(na2);
                String naq3=String.valueOf(na3);
                String naq4=String.valueOf(na4);
                String naq5=String.valueOf(na5);
                String naq6=String.valueOf(na7);
                String naq7=na7dd;

               // frame4 ew =new frame4();
                frame2 f23=new frame2();
                //ew.bill(naq1);
                f23.main(naq1,naq2,naq3,naq4,naq5,naq6,naq7);
                f.dispose();


                //----------------------------------------------------------------




            }
        });

        //---------------------------------------------------------

        f.setLayout(null);
        f.setVisible(true);

    }
}









public class project
{
    public static void main(String[] args)
    {

        myframe fram=new myframe();

    }

}

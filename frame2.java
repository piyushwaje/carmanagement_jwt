import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame2 {
     static String s1,s2,s3,s4,s5,s6,s7date;

    public static void main( String sl21,String sl22,String sl23,String sl24,String sl25,String sl26,String date)

    {

        s1=sl21;
        s2=sl22;
        s3=sl23;
        s4=sl24;
        s5=sl25;
        s6=sl26;
        s7date=date;

        JFrame f2= new JFrame("CAR SERVICE CENTER");
        f2.setSize(900,700);
        f2.setResizable(false);
        f2.setLocation(0,0);

        f2.setVisible(true);
        Color c1 = new Color(253, 238, 222);
        Container c2=f2.getContentPane();
        c2.setLayout(null);
        c2.setBackground(c1);
        //-------------------------------------------------------------
        JLabel sl1=new JLabel("GALAXY CAR SERVICE CENTER INFORMATION SYSTEM ");
        sl1.setBounds(90,50, 700,30);
        Font font=new Font("Arial",Font.BOLD,25);
        sl1.setFont(font);
        c2.add(sl1);
        //----------------------------------------------------------------
        JLabel sl2=new JLabel("CAR BRAND");
        sl2.setBounds(130,90, 700,30);
        Font font1=new Font("Arial",Font.PLAIN,18);
        sl2.setFont(font1);
        c2.add(sl2);
        //-------------------------------------------------------------------
        String []brand={"HONDA","HUNDAI","SUZUKI","TATA","TOYOTA","KIA","JEEP","OTHER"};
        JComboBox cb=new JComboBox(brand);
        cb.setBounds(130,120, 100,30);
        c2.add(cb);


        //-------------------------------------------------------------------
        JLabel sl3=new JLabel("CAR MODEL");
        sl3.setBounds(330,90, 700,30);
        sl3.setFont(font1);
        c2.add(sl3);
        //----------------------------------------------------------------
        JTextField cb1=new JTextField();
        cb1.setBounds(310,120, 150,30);
        c2.add(cb1);
        //----------------------------------------------------------------
        JLabel sl4=new JLabel("CAR NUMBER");
        sl4.setBounds(530,90, 700,30);
        sl4.setFont(font1);
        c2.add(sl4);
        //----------------------------------------------------------------
        JTextField cb2=new JTextField();
        cb2.setBounds(520,120, 150,30);
        c2.add(cb2);
        //----------------------------------------------------------------
        JLabel sl5=new JLabel("* SELECT SERVICES");
        sl5.setBounds(370,170, 700,30);
        Font font2=new Font("Arial",Font.BOLD,20);
        sl5.setFont(font2);
        c2.add(sl5);
        //----------------------------------------------------------------
        //breakpad changed
        JLabel sl6 =new JLabel("1)BREAKPAD:");
        sl6.setBounds(100,210, 700,30);
        Font bfont=new Font("Arial",Font.PLAIN,15);
        sl6.setFont(bfont);
        c2.add(sl6);

        //----------------------------------------------------------------
        String [] ch ={"no","yes"};
        JComboBox cb3= new JComboBox(ch);
        cb3.setBounds(300,210, 80,30);
        c2.add(cb3);

        //----------------------------------------------------------------
        JLabel sl7 =new JLabel("2)NO OF TYRES:");
        sl7.setBounds(100,240, 700,30);

        sl7.setFont(bfont);
        c2.add(sl7);
        //----------------------------------------------------------------
        // tyres
        JTextField cb4=new JTextField();
        cb4.setBounds(300,240, 80,30);
        c2.add(cb4);
        //----------------------------------------------------------------
        //ac filters
        JLabel sl8 =new JLabel("3)AC FILTER:");
        sl8.setBounds(100,270, 700,30);

        sl8.setFont(bfont);
        c2.add(sl8);

        //----------------------------------------------------------------

        JComboBox cb5= new JComboBox(ch);
        cb5.setBounds(300,270, 80,30);
        c2.add(cb5);
        //----------------------------------------------------------------
        JLabel sl9 =new JLabel("4)SUSPENSION:");
        sl9.setBounds(100,300, 700,30);
        //suspention cheak
        sl9.setFont(bfont);
        c2.add(sl9);
        //----------------------------------------------------------------
        JComboBox cb6= new JComboBox(ch);
        cb6.setBounds(300,300, 80,30);
        c2.add(cb6);
        //----------------------------------------------------------------
        //wheel alighment
        JLabel sl10 =new JLabel("5)WHEEL ALIGNMENT:");

        sl10.setBounds(100,330, 700,30);
        sl10.setFont(bfont);
        c2.add(sl10);

        //----------------------------------------------------------------
        JComboBox cb7= new JComboBox(ch);
        cb7.setBounds(300,330, 80,30);
        c2.add(cb7);
        //----------------------------------------------------------------
        //dent repair and painting
        JLabel sk1 =new JLabel("6)DENT AND REPAINTING:");
        sk1.setBounds(100,360, 700,30);
        sk1.setFont(bfont);
        c2.add(sk1);
        //----------------------------------------------------------------
        JComboBox cb8= new JComboBox(ch);
        cb8.setBounds(300,360, 80,30);
        c2.add(cb8);

        //----------------------------------------------------------------
        //engine oil
        JLabel sk2 =new JLabel("7)ENGINE OIL:");
        sk2.setBounds(100,390, 700,30);
        sk2.setFont(bfont);
        c2.add(sk2);
        //----------------------------------------------------------------
        JComboBox cb9= new JComboBox(ch);
        cb9.setBounds(300,390, 80,30);
        c2.add(cb9);
        //----------------------------------------------------------------
        //part replacement
        JLabel sk3 =new JLabel("8)PART REPLACEMENT:");
        sk3.setBounds(100,420, 700,30);
        sk3.setFont(bfont);
        c2.add(sk3);
        //----------------------------------------------------------------
        JTextField c6=new JTextField();
        c6.setBounds(300,420, 80,30);
        c2.add(c6);
        //----------------------------------------------------------------
        //washing
        JLabel sk4 =new JLabel("9)WASHING:");
        sk4.setBounds(100,450, 700,30);
        sk4.setFont(bfont);
        c2.add(sk4);
        //----------------------------------------------------------------
        JComboBox cb10= new JComboBox(ch);
        cb10.setBounds(300,450, 80,30);
        c2.add(cb10);

        //----------------------------------------------------------------
        //servic
        JLabel sk5 =new JLabel("10)CAR SERVICING:");
        sk5.setBounds(100,480, 700,30);
        sk5.setFont(bfont);
        c2.add(sk5);
        //----------------------------------------------------------------
        JComboBox cb11= new JComboBox(ch);
        cb11.setBounds(300,480, 80,30);
        c2.add(cb11);
        //----------------------------------------------------------------
        //any
        JLabel sk6 =new JLabel("11)ANY PROBLEM:");
        sk6.setBounds(100,510, 700,30);
        sk6.setFont(bfont);
        c2.add(sk6);
        //----------------------------------------------------------------
        JTextField c7=new JTextField();
        c7.setBounds(300,510, 80,30);
        c2.add(c7);
        //----------------------------------------------------------------
        JLabel label1 = new JLabel(); //JLabel Creation
        label1.setIcon(new ImageIcon("2.png")); //Sets the image to be displayed as an icon
        Dimension size = label1.getPreferredSize(); //Gets the size of the image
        label1.setBounds(300, 150, size.width, size.height); //Sets the location of the image

        c2.add(label1);
        //----------------------------------------------------------------
        JButton b1=new JButton("GENERATE BILL");
        b1.setBackground(Color.decode("#845F23"));
        b1.setForeground(Color.white);
        b1.setOpaque(true);
        b1.setBorderPainted(false);
        f2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        b1.setBounds(400,560,200,60);
        c2.add(b1);
        f2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String brands2=cb.getSelectedItem().toString();
                String model=cb1.getText();
                String carno= cb2.getText();
                String i1=cb3.getSelectedItem().toString();
                String i2=cb4.getText();
                String i3=cb5.getSelectedItem().toString();
                String i4=cb6.getSelectedItem().toString();
                String i5=cb7.getSelectedItem().toString();
                String i6=cb8.getSelectedItem().toString();
                String i7=cb9.getSelectedItem().toString();
                String i8=c6.getText();
                String i9=cb10.getSelectedItem().toString();
                String i10=cb11.getSelectedItem().toString();
                String i11=c7.getText();
                int tn=Integer.parseInt(i2);
                int prp=Integer.parseInt(i8);
                int anypr=Integer.parseInt(i11);
                int i1p,i2p,i3p,i4p,i5p,i6p,i7p,i8p,i9p,i10p,i11p;
                int totalcost=0;
                if(i1=="yes")
                {
                     i1p=400;
                }
                else
                {
                    i1p=0;
                }
                i2p=tn*5000;
                if(i3=="yes")
                {
                    i3p=1400;
                }
                else
                {
                    i3p=0;
                }
                if(i4=="yes")
                {
                    i4p=2000;
                }
                else
                {
                    i4p=0;
                }
                if(i5=="yes")
                {
                    i5p=2400;
                }
                else
                {
                    i5p=0;
                }
                if(i6=="yes")
                {
                    i6p=50000;
                }
                else
                {
                    i6p=0;
                }
                if(i7=="yes")
                {
                    i7p=5000;
                }
                else
                {
                    i7p=0;
                }
                i8p=prp;
                if(i9=="yes")
                {
                    i9p=500;
                }
                else
                {
                    i9p=0;
                }
                if(i10=="yes")
                {
                    i10p=3000;
                }
                else
                {
                    i10p=0;
                }
                i11p=anypr;
                totalcost=i1p+i2p+i3p+i4p+i5p+i6p+i7p+i8p+i9p+i10p+i11p;


                frame3 f3m=new frame3();
                f3m.bill(s1,s2,s3,s4,s5,s6,s7date,brands2,model,carno,i1p,i2p,i3p,i4p,i5p,i6p,i7p,i8p,i9p,i10p,i11p,totalcost);
                f2.dispose();



                //----------------------------------------------------------------




            }


        //----------------------------------------------------------------




    });
    }
}

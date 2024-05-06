import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame3 {

    String s;
    public void bill(String s1,String s2,String s3,String s4,String s5,String s6,String s7date,String brands2,String model,String carno,int i1p,int i2p,int i3p,int i4p,int i5p,int i6p,int i7p,int i8p,int i9p,int i10p,int i11p,int total)
    {
        String w1=s1;
        String w2=s2;
        String w3=s3;
        String w4=s4;
        String w5=s5;
        String w6=s6;
        String w7=s7date;
        String w8=brands2;
        String w9=model;
        String w10=carno;
        int w11=i1p;
        int w12=i2p;
        int w13=i3p;
        int w14=i4p;
        int w15=i5p;
        int w16=i6p;
        int w17=i7p;
        int w18=i8p;
        int w19=i9p;
        int w20=i10p;
        int w21=i11p;
        int w22=total;

        JFrame f4= new JFrame("CAR SERVICE CENTER");
        f4.setSize(900,700);
        f4.setResizable(false);
        f4.setLocation(0,0);

        f4.setVisible(true);
        Color c1 = new Color(253, 238, 222);
        Container c2=f4.getContentPane();
        c2.setLayout(null);
        c2.setBackground(c1);
        f4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //=------------------------------------------------------

        JLabel sl1=new JLabel("GALAXY CAR SERVICE CENTER INFORMATION SYSTEM ");
        sl1.setBounds(90,50, 700,30);
        Font font=new Font("Arial",Font.BOLD,25);
        sl1.setFont(font);
        c2.add(sl1);

        //----------------------------------------------------------------
        JLabel sl2=new JLabel("CAR BRAND:"+w8);
        sl2.setBounds(130,90, 700,30);
        Font font1=new Font("Arial",Font.PLAIN,18);
        sl2.setFont(font1);
        c2.add(sl2);
        //-------------------------------------------------------------------

        //-------------------------------------------------------------------
        JLabel sl3=new JLabel("CAR MODEL:"+w9);
        sl3.setBounds(330,90, 700,30);
        sl3.setFont(font1);
        c2.add(sl3);
        //----------------------------------------------------------------

        //----------------------------------------------------------------
        JLabel sl4=new JLabel("CAR NUMBER:"+w10);
        sl4.setBounds(530,90, 700,30);
        sl4.setFont(font1);
        c2.add(sl4);
        //----------------------------------------------------------------

        //----------------------------------------------------------------
        JLabel sls17 =new JLabel("NAME:"+s1);
        sls17.setBounds(100,150, 700,30);
        Font bfont12=new Font("Arial",Font.PLAIN,15);
        sls17.setFont(bfont12);
        c2.add(sls17);
        //----------------------------------------------------------------
        JLabel sls18 =new JLabel("PHONE NUMBER:"+s4);
        sls18.setBounds(100,170, 700,30);
        sls17.setFont(bfont12);
        c2.add(sls18);
        //----------------------------------------------------------------
        JLabel sls19 =new JLabel("DATE:"+w7);
        sls19.setBounds(400,170, 700,30);
        sls17.setFont(bfont12);
        c2.add(sls19);
        //----------------------------------------------------------------
        //breakpad changed
        JLabel sl6 =new JLabel("1)BREAKPAD:"+w11);
        sl6.setBounds(100,210, 700,30);
        Font bfont=new Font("Arial",Font.PLAIN,15);
        sl6.setFont(bfont);
        c2.add(sl6);

        //----------------------------------------------------------------


        //----------------------------------------------------------------
        JLabel sl7 =new JLabel("2)TYRES:"+w12);
        sl7.setBounds(100,240, 700,30);

        sl7.setFont(bfont);
        c2.add(sl7);
        //----------------------------------------------------------------
        // tyres

        //----------------------------------------------------------------
        //ac filters
        JLabel sl8 =new JLabel("3)AC FILTER:"+w13);
        sl8.setBounds(100,270, 700,30);

        sl8.setFont(bfont);
        c2.add(sl8);

        //----------------------------------------------------------------


        //----------------------------------------------------------------
        JLabel sl9 =new JLabel("4)SUSPENSION:"+ w14);
        sl9.setBounds(100,300, 700,30);
        //suspention cheak
        sl9.setFont(bfont);
        c2.add(sl9);
        //----------------------------------------------------------------

        //----------------------------------------------------------------
        //wheel alighment
        JLabel sl10 =new JLabel("5)WHEEL ALIGNMENT:"+w15);

        sl10.setBounds(100,330, 700,30);
        sl10.setFont(bfont);
        c2.add(sl10);

        //----------------------------------------------------------------

        //----------------------------------------------------------------
        //dent repair and painting
        JLabel sk1 =new JLabel("6)DENT AND REPAINTING:"+w16);
        sk1.setBounds(100,360, 700,30);
        sk1.setFont(bfont);
        c2.add(sk1);
        //----------------------------------------------------------------

        //----------------------------------------------------------------
        //engine oil
        JLabel sk2 =new JLabel("7)ENGINE OIL:"+w17);
        sk2.setBounds(100,390, 700,30);
        sk2.setFont(bfont);
        c2.add(sk2);
        //----------------------------------------------------------------

        //----------------------------------------------------------------
        //part replacement
        JLabel sk3 =new JLabel("8)PART REPLACEMENT:"+w18);
        sk3.setBounds(100,420, 700,30);
        sk3.setFont(bfont);
        c2.add(sk3);
        //----------------------------------------------------------------

        //----------------------------------------------------------------
        //washing
        JLabel sk4 =new JLabel("9)WASHING:"+w19);
        sk4.setBounds(100,450, 700,30);
        sk4.setFont(bfont);
        c2.add(sk4);
        //----------------------------------------------------------------

        //----------------------------------------------------------------
        //servic
        JLabel sk5 =new JLabel("10)CAR SERVICING:"+w20);
        sk5.setBounds(100,480, 700,30);
        sk5.setFont(bfont);
        c2.add(sk5);
        //----------------------------------------------------------------

        //----------------------------------------------------------------
        //any
        JLabel sk6 =new JLabel("11)ANY PROBLEM:"+w21);
        sk6.setBounds(100,510, 700,30);
        sk6.setFont(bfont);
        c2.add(sk6);
        //----------------------------------------------------------------
        JLabel sk7 =new JLabel("TOTAL BILL:"+w22);
        sk7.setBounds(100,540, 700,30);
        sk7.setFont(bfont);
        c2.add(sk7);
        //----------------------------------------------------------------

        //----------------------------------------------------------------
        JButton bF1=new JButton("PAY"+w22);
        bF1.setBackground(Color.decode("#098342"));
        bF1.setForeground(Color.white);
        bF1.setOpaque(true);
        bF1.setBorderPainted(false);
        f4.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        bF1.setBounds(350,580,200,60);
        c2.add(bF1);
        f4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        bF1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            frame4 bw=new frame4();
            bw.m1();
            f4.dispose();

            }
        });

    }
}
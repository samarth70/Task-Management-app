// this is an automated app ,which helps in accessing of application,task managing etc.
// gnome-control-center
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.awt.Color;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class ntccproj implements ActionListener
{
    Frame f,f2;
    CheckboxGroup chb; 
    ImageIcon img1,img2,img3,img4,img5,img6,img7;
    Checkbox c1,c2,c3,c4,c5;    
    Label l,l2,l3;
    JPanel jp;
    JLabel l4,l5,l6,l7,l8,l9;
    Button b1, b2,b3,b4,b5,b6,b7,b8;
    public ntccproj()
    {
       

        f = new Frame("Task Assistant");
        f.setSize(800,750);
        f.setVisible(true);
        f.setLayout(null);
        f.setBackground(new Color(245,222,179));
      
        
        img1=new ImageIcon(getClass().getResource("siri2.jpg"));
        Image image = img1.getImage(); // transform it 
        Image newimg = image.getScaledInstance(80, 65,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        img1 = new ImageIcon(newimg);
        l4=new JLabel(img1);
        l4.setBounds(295,235,50,45);
        f.add(l4);  
       
        img2=new ImageIcon(getClass().getResource("date2.jpg"));
        Image image2 = img2.getImage(); // transform it 
        Image newimg2 = image2.getScaledInstance(55, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        img2 = new ImageIcon(newimg2);
        l5=new JLabel(img2);
        l5.setBounds(73,235,50,45);
        f.add(l5);

        img3=new ImageIcon(getClass().getResource("google.jpg"));
        Image image3 = img3.getImage(); // transform it 
        Image newimg3 = image3.getScaledInstance(40, 46,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        img3 = new ImageIcon(newimg3);
        l6=new JLabel(img3);
        l6.setBounds(73,164,40,45);
        f.add(l6);

        img4=new ImageIcon(getClass().getResource("music3.png"));
        Image image4= img4.getImage(); // transform it 
        Image newimg4 = image4.getScaledInstance(40, 46,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        img4 = new ImageIcon(newimg4);
        l7=new JLabel(img4);
        l7.setBounds(293,164,40,45);
        f.add(l7);

        img5=new ImageIcon(getClass().getResource("code2.jpg"));
        Image image5= img5.getImage(); // transform it 
        Image newimg5 = image5.getScaledInstance(40, 46,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        img5 = new ImageIcon(newimg5);
        l8=new JLabel(img5);
        l8.setBounds(500,164,40,45);
        f.add(l8);

        img6=new ImageIcon(getClass().getResource("files.jpg"));
        Image image6= img6.getImage(); // transform it 
        Image newimg6 = image6.getScaledInstance(40, 46,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        img6 = new ImageIcon(newimg6);
        l8=new JLabel(img6);
        l8.setBounds(500,235,40,45);
        f.add(l8);

        img7=new ImageIcon(getClass().getResource("setting.jpg"));
        Image image7= img7.getImage(); // transform it 
        Image newimg7 = image7.getScaledInstance(45, 56,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        img7 = new ImageIcon(newimg7);
        l9=new JLabel(img7);
        l9.setBounds(500,305,40,45);
        f.add(l9);

        l=new Label("Hi,How May I Help You!!");
        l.setBounds(90,85,600,50);
        l.setFont(new Font("Calibri", Font.BOLD, 40));
        f.add(l);
        try{
        Thread.sleep(1000);
            }
        catch (InterruptedException ie)
        {System.out.println("");}   
        
        l3=new Label("************************************************************************************************");
        l3.setBounds(40,600,700,40);
        l3.setFont(new Font("Calibri", Font.BOLD, 40));
        f.add(l3);
       


        l2=new Label("");
        l2.setBounds(70,420,400,50);
        l2.setFont(new Font("Calibri", Font.BOLD, 25));
        f.add(l2);
        try{
        Thread.sleep(1200);
            }
        catch (InterruptedException ie)
        {System.out.println("");} 


        b1=new Button("Open Google ");
        b1.setBounds(70,160,200,55);
        b1.setFont(new Font("Calibri", Font.PLAIN, 17));
        f.add(b1);
        b1.setBackground(Color.yellow);
        b1.addActionListener(this);
        // try{
        // Thread.sleep(1200);
        //     }
        // catch (InterruptedException ie)
        // {System.out.println("");} 

        b2=new Button("   Play Spotify");
        b2.setBounds(280,160,200,55);
        b2.setFont(new Font("Calibri", Font.PLAIN, 17));
        f.add(b2);
        b2.setBackground(new Color(220,20,60));
        b2.addActionListener(this);
        // try{
        // Thread.sleep(1200);
        //     }
        // catch (InterruptedException ie) 
        // {System.out.println("");}   
        
        b6=new Button("Code Inn!");
        b6.setBounds(490,160,200,55);
        b6.setFont(new Font("Calibri", Font.PLAIN, 17));
        f.add(b6);
        b6.setBackground(Color.cyan);
        b6.addActionListener(this);
         try{
        Thread.sleep(1200);
            }
        catch (InterruptedException ie) {System.out.println("");}
        

        b3=new Button("   Date & Time");
        b3.setBounds(70,230,200,55);
        b3.setFont(new Font("Calibri", Font.PLAIN, 17));
        f.add(b3);
        b3.setBackground(Color.green);
        b3.addActionListener(this);
        // try{
        // Thread.sleep(1200);
        //     }
        // catch (InterruptedException ie) {System.out.println("");}

       


        b5=new Button("My_Siri");
        b5.setBounds(280,230,200,55);
        b5.setFont(new Font("Calibri", Font.PLAIN, 17));
        f.add(b5);
        b5.setBackground(Color.orange);
        b5.addActionListener(this);
        //  try{
        // Thread.sleep(1200);
        //     }
        // catch (InterruptedException ie) {System.out.println("");}

       

        b7=new Button("Files");
        b7.setBounds(490,230,200,55);
        b7.setFont(new Font("Calibri", Font.PLAIN, 17));
        f.add(b7);
        b7.setBackground(new Color(153,255,153));
        b7.addActionListener(this);
         try{
        Thread.sleep(1200);
            }
        catch (InterruptedException ie) {System.out.println("");}


         b4=new Button("Press if Liked!");
        b4.setBounds(70,300,200,55);
        b4.setFont(new Font("Calibri", Font.PLAIN, 17));
        f.add(b4);
        b4.setBackground(new Color(0,150,136));
        b4.addActionListener(this);
        //  try{
        // Thread.sleep(1200);
        //     }
        // catch (InterruptedException ie) {System.out.println("");}
        

        b8=new Button("Settings");
        b8.setBounds(490,300,200,55);
        b8.setFont(new Font("Calibri", Font.PLAIN, 17));
        f.add(b8);
        b8.setBackground(new Color(123,104,238));
        b8.addActionListener(this); 


        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
       

    }
    

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            try
            {
                Runtime runtime = Runtime.getRuntime();     //getting Runtime object
                String[] s = new String[] {"firefox"};
                Process process = runtime.exec(s);
            }
            catch (IOException e2)
            {
                e2.printStackTrace();
            }
        }
        else if(e.getSource()==b2)
        {
            try
            {
                Runtime runtime = Runtime.getRuntime();     
                String[] s = new String[] {"spotify"};
                Process process = runtime.exec(s);
            }
            catch (IOException e2)
            {
                e2.printStackTrace();
            }  
        }
        else if(e.getSource()==b3)
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            l2.setText(dtf.format(now));  
        }
        else if(e.getSource()==b4)
            {
                l2.setText("Thank you for the feedback!");
            } 

        else if(e.getSource()==b5)
        {
            try
            {
                Process p = Runtime.getRuntime().exec("python voice_assistant.py");
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = "";
                while ((line = reader.readLine()) != null)
                {
                      System.out.println(line + "\n");
                }
            }
            catch (IOException e3)
            {
                e3.printStackTrace();
            }  
        }

        else if(e.getSource()==b6)
        {
            try
            {
                Process p = Runtime.getRuntime().exec("subl .");
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = "";
                while ((line = reader.readLine()) != null)
                {
                      System.out.println(line + "\n");
                }
            }
            catch (IOException e3)
            {
                e3.printStackTrace();
            }  
        } 


        else if(e.getSource()==b7)
        {
            try 
            {
                    Desktop.getDesktop().open(new File("/home/sam"));
            }

             catch (IOException e5)
            {
                e5.printStackTrace();
            }
        }

        else if(e.getSource()==b8)
        {
            try
            {
                Process p = Runtime.getRuntime().exec("gnome-control-center");
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = "";
                while ((line = reader.readLine()) != null)
                {
                      System.out.println(line + "\n");
                }
            }
            catch (IOException e3)
            {
                e3.printStackTrace();
            }  
        }
             
    }


    public static void main(String args[])
    {
        new ntccproj();
    }
    
}

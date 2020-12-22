
package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator implements ActionListener    {
    int op;
    double b,c,d;
    JFrame jf;
    JButton j1,j2,j3,j4,j5,j6,j7,j8,j9,j0,j11;
    JButton o1,o2,o3,o4,o5,o6,o7,o8;
    //add,substract,multiply,devide,equel,evenodd,prime,decimal conv.
    JTextField jtx;
  //------------------
    int prime(double num)/*method for finding prime numbers*/
    {
     int result=0;
     for(int i=2;i<=num/2;i++)
     {
     if(num%2==0)
     {
     result=1;
     break;
     }
     }
     return result;    
    }       
    //------------------
    
    void calc()
    {
     
    jf=new JFrame();
    jtx= new JTextField(15);
    Container c=jf.getContentPane();
    c.setLayout(new FlowLayout());
    //-------------------
    j1=new JButton("1");
    j2=new JButton("2");
    j3=new JButton("3");
    j4=new JButton("4");
    j5=new JButton("5");
    j6=new JButton("6");
    j7=new JButton("7");
    j8=new JButton("8");
    j9=new JButton("9");
    j0=new JButton("0");
    j11=new JButton("clr");
    o1=new JButton("+");
    o2=new JButton("-");
    o3=new JButton("x");
    o4=new JButton("/");
    o5=new JButton("=");
    o6=new JButton("even/odd");
    o7=new JButton("Prime?");
    o8=new JButton("Decimal->Binary");
     //----------------------------------
     j1.addActionListener(this);
     j2.addActionListener(this);
     j3.addActionListener(this);
     j4.addActionListener(this);
     j5.addActionListener(this);
     j6.addActionListener(this);
     j7.addActionListener(this);
     j8.addActionListener(this);
     j9.addActionListener(this);
     j0.addActionListener(this);
     j11.addActionListener(this);
     o1.addActionListener(this);
     o2.addActionListener(this);
     o3.addActionListener(this);
     o4.addActionListener(this);
     o5.addActionListener(this);
     o6.addActionListener(this);
     o7.addActionListener(this);
     o8.addActionListener(this);
     //---------------------------
     c.add(jtx);
     c.add(j1);
     c.add(j2);
     c.add(j3);
     c.add(j4);
     c.add(j5);
     c.add(j6);
     c.add(j7);
     c.add(j8);
     c.add(j9);
     c.add(j0);
     c.add(j11);
     c.add(o1);
     c.add(o2);
     c.add(o3);
     c.add(o4);
     c.add(o5);
     c.add(o6);
     c.add(o7);
     c.add(o8);
     //-----------------------------------
     jf.setVisible(true);
     jf.setSize(200,290);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
    }
        Calculator(){
       calc() ;        
    }
    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource()==j1)
        {
        jtx.setText(jtx.getText()+"1");
        }   
        else if(a.getSource()==j2)
        {
        jtx.setText(jtx.getText()+"2");
        }
        else if(a.getSource()==j3)
        {
        jtx.setText(jtx.getText()+"3");
        }
        else if(a.getSource()==j4)
        {
        jtx.setText(jtx.getText()+"4");
        }
        else if(a.getSource()==j5)
        {
        jtx.setText(jtx.getText()+"5");
        }
        else if(a.getSource()==j6)
        {
        jtx.setText(jtx.getText()+"6");
        }
        else if(a.getSource()==j7)
        {
        jtx.setText(jtx.getText()+"7");
        }
        else if(a.getSource()==j8)
        {
        jtx.setText(jtx.getText()+"8");
        }
        else if(a.getSource()==j9)
        {
        jtx.setText(jtx.getText()+"9");
        }
        else if(a.getSource()==j0)
        {
        jtx.setText(jtx.getText()+"0");
        }
        else if(a.getSource()==j11)
        {
        jtx.setText("");
        }
        else if(a.getSource()==o1)
        {
        b=Double.parseDouble(jtx.getText());
        op=1;
        jtx.setText("");
        }
        
        else if(a.getSource()==o2)
        {
        b=Double.parseDouble(jtx.getText());
        op=2;
        jtx.setText("");
        }
        else if(a.getSource()==o3)
        {
        b=Double.parseDouble(jtx.getText());
        op=3;
        jtx.setText("");
        }
        else if(a.getSource()==o4)
        {
        b=Double.parseDouble(jtx.getText());
        op=4;
        jtx.setText("");
        }
        else if(a.getSource()==o5)
        {
          c=Double.parseDouble(jtx.getText());
            switch (op) {
                case 1:
                    d=b+c;
                    break;
                case 2:
                    d=b-c;
                    break;
                case 3:
                    d=b*c;
                    break;
                case 4:
                    d=b/c;
                    break;
                default:
                    break;
            }
          jtx.setText(""+d);
        }
        else if(a.getSource()==o6)
        {
            b=Double.parseDouble(jtx.getText());
            if(b%2==0)
            {
               jtx.setText("Number is even");          
            }
            else
            {
            jtx.setText("Number is odd");
            }
        }
        
        else if(a.getSource()==o7)
            {
              b=Double.parseDouble(jtx.getText());
              int p;
              p=prime(b);
              if(p==0)
              {
                  jtx.setText("This is a prime number");
              }                         
              else if(p==1)
              {
                  jtx.setText("This is a composite number");
              }
            }
        else if(a.getSource()==o8)
        {
            b=Double.parseDouble(jtx.getText());     
            jtx.setText(Integer.toBinaryString((int) b)); /*found this builtin method from https://www.javatpoint.com/java-decimal-to-binary */
        }
        
    }
  

    
        
        
       
    
        public static void main(String[] args) {
      Calculator obj=new Calculator();
    }
    
}   




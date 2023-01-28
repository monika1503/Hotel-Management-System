package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class Customerinfo extends JFrame implements ActionListener{
    JTable table;
    JButton back;
Customerinfo()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
      
      
      JLabel l1=new JLabel("Document Type");
      l1.setBounds(5, 10, 100, 20);
      add(l1);
       
      JLabel l2=new JLabel("Number");
      l2.setBounds(130, 10, 100, 20);
      add(l2);
      
       
      JLabel l3=new JLabel("Name");
      l3.setBounds(250, 10, 100, 20);
      add(l3);
      
       
      JLabel l4=new JLabel("Gender");
      l4.setBounds(380, 10, 100, 20);
      add(l4);
      
       
      JLabel l5=new JLabel("Country");
      l5.setBounds(500, 10, 100, 20);
      add(l5);
      
       JLabel l6=new JLabel("Room Number");
      l6.setBounds(600, 10, 100, 20);
      add(l6);
      
       JLabel l7=new JLabel("Checkintime");
      l7.setBounds(750, 10, 100, 20);
      add(l7);
      
       JLabel l8=new JLabel("deposit");
      l8.setBounds(870, 10, 100, 20);
      add(l8);
      
      table=new JTable();
      table.setBounds(0, 40, 1000, 400);
      add(table);
      try
      {
          Conn c =new Conn();
                ResultSet rs=c.s.executeQuery("select * from customer");
                table.setModel(DbUtils.resultSetToTableModel(rs));
      }catch(Exception e)
      {
          e.printStackTrace();
      }
      
      back =new JButton("Back");
      back.setBackground(Color.WHITE);
      back.setForeground(Color.BLACK);
      back.addActionListener(this);
      back.setBounds(420, 500, 120, 30);
      add(back);
      
        setBounds(300, 200, 1000, 600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Reception();
    }
        
        public static void main(String args[])
        {
            new Customerinfo();
        }
    }
    


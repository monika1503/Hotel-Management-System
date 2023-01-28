package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Reception extends JFrame implements ActionListener {
        JButton newCustomer,rooms,department,allemployee,  managerinfo,customerinfo,searchroom,roomstatus,update,pickup,checkout,logout;
        
       
    Reception() 
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       newCustomer=new JButton("New Customer Form");
       newCustomer.setBounds( 10, 30, 200, 30);
       newCustomer.setBackground(Color.WHITE);
       newCustomer.setForeground(Color.BLACK);
       newCustomer.addActionListener(this);
       add(newCustomer);
      
      
      rooms=new JButton("Rooms");
      rooms.setBounds( 10, 70, 200, 30);
      rooms.setBackground(Color.WHITE);
      rooms.setForeground(Color.BLACK);
      rooms.addActionListener(this);
      add(rooms);
      
         
        department=new JButton("Department");
      department.setBounds( 10, 110, 200, 30);
     department.setBackground(Color.WHITE);
      department.setForeground(Color.BLACK);
       department.addActionListener(this);
      add(department);
      
         allemployee=new JButton("All Employee");
allemployee.setBounds( 10, 150, 200, 30);
     allemployee.setBackground(Color.WHITE);
      allemployee.setForeground(Color.BLACK);
             allemployee.addActionListener(this);

      add(allemployee);
      
        customerinfo=new JButton(" Customer Info");
 customerinfo.setBounds( 10, 190, 200, 30);
     customerinfo.setBackground(Color.WHITE);
       customerinfo.setForeground(Color.BLACK);
       customerinfo.addActionListener(this);
      add( customerinfo);
      
        managerinfo=new JButton(" Manager Info");
 managerinfo.setBounds( 10, 230, 200, 30);
     managerinfo.setBackground(Color.WHITE);
      managerinfo.setForeground(Color.BLACK);
       managerinfo.addActionListener(this);
      add( managerinfo);
      
    checkout=new JButton(" Checkout");
checkout.setBounds( 10, 270, 200, 30);
    checkout.setBackground(Color.WHITE);
       checkout.setForeground(Color.BLACK);
        checkout.addActionListener(this);
      add(  checkout);
      
       update=new JButton(" Update Status");
update.setBounds( 10, 310, 200, 30);
  update.setBackground(Color.WHITE);
     update.setForeground(Color.BLACK);
     update.addActionListener(this);
      add(  update);
      
      
      
     
     roomstatus=new JButton(" Update Room Status");
roomstatus.setBounds( 10, 350, 200, 30);
  roomstatus.setBackground(Color.WHITE);
  roomstatus.setForeground(Color.BLACK);
  roomstatus.addActionListener(this);
      add(  roomstatus);
      
         
         pickup=new JButton(" Pickup Service");
pickup.setBounds( 10, 390, 200, 30);
pickup.setBackground(Color.WHITE);
pickup.setForeground(Color.BLACK);
pickup.addActionListener(this);
      add(   pickup);
      
      
      
        searchroom=new JButton(" Search Room");
 searchroom.setBounds( 10, 430, 200, 30);
 searchroom.setBackground(Color.WHITE);
  searchroom.setForeground(Color.BLACK);
   searchroom.addActionListener(this);
      add(   searchroom);
      
      
   logout=new JButton(" Logout");
logout.setBounds( 10, 470, 200, 30);
 logout.setBackground(Color.WHITE);
 logout.setForeground(Color.BLACK);
logout.addActionListener(this);
      add(   logout);
      
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
      JLabel image=new JLabel(i1);
      image.setBounds(250, 30, 500, 470);
      add(image);
      
      
      
      
      
        setBounds(350, 200, 800, 570);
        setVisible(true);
    }
  public void actionPerformed(ActionEvent ae)
  {
      if(ae.getSource()==newCustomer)
      {
          setVisible(false);
          new AddCustomer();
      }else if(ae.getSource()==rooms){
          setVisible(false);
          new Room();
      }else if(ae.getSource()==department)
      {
          setVisible(false);
          new Department();
 
      }else if(ae.getSource()==allemployee)
      {
          setVisible(false);
          new  Employeeinfo();
 
      }else if(ae.getSource()==managerinfo)
      {
          setVisible(false);
          new  Managerinfo();
 
      }
else if(ae.getSource()==customerinfo)
      {
          setVisible(false);
          new  Customerinfo();
 
      }
           
else if(ae.getSource()==searchroom)
      {
          setVisible(false);
          new  Searchroom();
 
      }
      else if(ae.getSource()==update)
      {
          setVisible(false);
          new  Updatecheck();
 
      }
else if(ae.getSource()==roomstatus)
      {
          setVisible(false);
          new Updateroom();
 
      }
      else if(ae.getSource()==pickup)
      {
          setVisible(false);
          new Pickup();
 
      }
        else if(ae.getSource()==checkout)
      {
          setVisible(false);
          new Checkout();
 
      }  else if(ae.getSource()==logout)
      {
          setVisible(false);
          System.exit(0);
 
      }




      


  }
        
   public static void main(String args[]){
        new Reception();
    }
            
}
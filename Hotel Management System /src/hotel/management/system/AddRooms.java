
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddRooms extends JFrame implements ActionListener{
   
     JTextField   tfroom, tfprice;
     JComboBox availablecombo,cleancombo,bedcombo;
     JButton add,cancel;
    AddRooms()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       JLabel heading=new JLabel("Add Rooms");
       heading.setFont(new Font("Tahoma",Font.BOLD, 18));
       heading.setBounds(150, 20, 200, 20);
       add(heading );
       
        JLabel roomno=new JLabel("Room Number");
       roomno.setFont(new Font("Tahoma",Font.PLAIN, 18));
       roomno.setBounds(60, 80, 120, 30);
       add(roomno );
       tfroom=new JTextField();
       tfroom.setBounds(200, 80, 150, 30);
       add( tfroom);
       
        JLabel lblavailable=new JLabel("Available");
       lblavailable.setFont(new Font("Tahoma",Font.PLAIN, 16));
       lblavailable.setBounds(60, 130, 120, 30);
       add(   lblavailable );
       String availableOptions[]={"Available","Occupied"};
       availablecombo=new     JComboBox(availableOptions);
       availablecombo.setBounds(200, 130, 150, 30);
       availablecombo.setBackground(Color.WHITE);
       add(availablecombo);
       
       
        JLabel lblclean=new JLabel("Cleaning Status");
       lblclean.setFont(new Font("Tahoma",Font.PLAIN, 18));
       lblclean.setBounds(60, 180, 200, 30);
       add( lblclean );
       String cleanOptions[]={"Cleaned","Dirty"};
       cleancombo=new     JComboBox(cleanOptions);
        cleancombo.setBounds(200, 180, 150, 30);
       cleancombo.setBackground(Color.WHITE);
       add(cleancombo);
       
       
        JLabel lblprice=new JLabel("Price");
       lblprice.setFont(new Font("Tahoma",Font.PLAIN, 18));
       lblprice.setBounds(60, 230, 120, 30);
       add( lblprice );
       tfprice=new JTextField();
       tfprice.setBounds(200, 230, 150, 30);
       add(  tfprice);
       
        JLabel lblbed=new JLabel("Bed Type");
       lblbed.setFont(new Font("Tahoma",Font.PLAIN, 18));
       lblbed.setBounds(60, 280, 120, 30);
       add(lblbed);
       
       String bedOptions[]={"Single Bed","Double Bed"};
       bedcombo=new     JComboBox(bedOptions);
       bedcombo.setBounds(200, 280, 150, 30);
       bedcombo.setBackground(Color.WHITE);
       add(bedcombo);
       
       add=new JButton("Add Room");
       add.setBackground(Color.WHITE);
       add.setForeground(Color.BLACK);
       add.setBounds(60, 350, 130, 30);
       add.addActionListener(this);
       add(add);
       
        
       cancel=new JButton("Cancel");
       cancel.setBackground(Color.WHITE);
       cancel.setForeground(Color.BLACK);
       cancel.setBounds(220, 350, 130, 30);
        cancel.addActionListener(this);
       add(cancel);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
 
       JLabel image=new JLabel(i1);
       image.setBounds(400, 30, 500, 300);
       add(image);
       
       
       
      setBounds(330, 200, 940, 470);
      setVisible(true);
              
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==add)
        {
            String roomnumber=tfroom.getText();
            String availability=(String) availablecombo.getSelectedItem();
            String status=(String) cleancombo.getSelectedItem();
            String price=tfprice.getText();
            String type=(String)bedcombo.getSelectedItem();

             try{
                Conn conn=new Conn();
                String str="insert into room values ('"+roomnumber+"', '"+availability+"', '"+status+"','"+price+"','"+type+"')";
                conn.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"New Room Added Successfully");
                setVisible(false);
                }catch(Exception e)
                 {
                    e.printStackTrace();
                 }
             
        }else
        {
            setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new AddRooms();
    }
    
}

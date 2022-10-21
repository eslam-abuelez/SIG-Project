package InvoiceFrameWithComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvoiceFramewithComponents extends JFrame implements ActionListener {

    // create (Create Create New Invoice/Delete Invoice) buttons.
            private JButton btnCreateNewInvoice ;
             private JButton btnDeleteInvoice ;
             private JTextField dateSearchField;
            // private JTextField
     public    InvoiceFramewithComponents(){
         super("InvoiceFramewithComponents" );
         setLayout(new FlowLayout());


         //Set frame size and location.
         setSize(800,600);
         setLocation(350,150);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // button create new Invoice

         btnCreateNewInvoice= new JButton("Create New Invoice");
         add(btnCreateNewInvoice);
         //Listner l = new Listner();
         btnCreateNewInvoice.addActionListener(this);



         // button Delete Invoice
         btnDeleteInvoice= new JButton("DeleteInvoice");
         add(btnDeleteInvoice);
         //Listner l2 = new Listner();
         btnDeleteInvoice.addActionListener(this);
         btnDeleteInvoice.setLocation(350,580);



         // Date Search Field

             dateSearchField = new JTextField("Date Search");
            add(new JLabel("Date Search"));
             dateSearchField.setLayout(new FlowLayout());

         dateSearchField.setText("Date Search");


             dateSearchField.setSize(200, 50);
             dateSearchField.setLocation(500, 700);
             add(dateSearchField);
             setVisible(true);









     }
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(btnCreateNewInvoice)){

        JOptionPane.showMessageDialog(null,"New Invoice is Created","dialog",JOptionPane.INFORMATION_MESSAGE);
    } else if (e.getSource().equals( btnDeleteInvoice)){
             JOptionPane.showMessageDialog(null,"Invoice is Deleted","dialog",JOptionPane.INFORMATION_MESSAGE);
         }

         }


    }

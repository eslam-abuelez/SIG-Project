package InvoiceFrameWithComponents;

import table.MenuTest;
//import table.TableFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InvoiceFramewithComponents extends JFrame implements ActionListener {

    // create (Create Create New Invoice/Delete Invoice) buttons.
    private JButton btnCreateNewInvoice ;
    private JButton btnDeleteInvoice ;
    private JTextField dateSearchField;

    private JTextField searchInvoiceNumber;


    private JMenuBar menuBar;
    private JMenuItem  fileMenu;
    private JMenuItem  loadFile;
    private JMenuItem saveFile;


    private JTable InvoiceDetails;
    private String[]cols= {"No.","Date","Customer","Total"};
    private  String[][]data={{"0","22-10-22","Islam", "SubZero"},
            {"0","22-10-22","Islam", "SubZero"}
    };






    // private JTextField
    public    InvoiceFramewithComponents() {
        super("InvoiceFramewithComponents");
        setLayout(new FlowLayout());


        //Set frame size and location.
        setSize(1200, 800);
        setLocation(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // button create new Invoice

        btnCreateNewInvoice = new JButton("Create New Invoice");
        setLayout(null);
        btnCreateNewInvoice.setBounds(250,680,160,20);
        add(btnCreateNewInvoice);
        //Listner l = new Listner();
        btnCreateNewInvoice.addActionListener(this);


        // button Delete Invoice
        btnDeleteInvoice = new JButton("DeleteInvoice");
        btnDeleteInvoice.setLayout(null);
        btnDeleteInvoice.setBounds(430,680,160,20);
        add(btnDeleteInvoice);
        //Listner l2 = new Listner();
        btnDeleteInvoice.addActionListener(this);
        // btnDeleteInvoice.setLocation(350, 580);


        // Date Search Field

        dateSearchField = new JTextField("Date Search");
        add(new JLabel("Date Search"));

        dateSearchField.setLayout(null);
        dateSearchField.setBounds(620,30,120,20);
        //dateSearchField.setText("Date Search");


        //dateSearchField.setSize(200, 50);
        //dateSearchField.setLocation(500, 700);
        add(dateSearchField);
        // setVisible(true);

// Search Using Invoice Number
        searchInvoiceNumber = new JTextField("Invoice Number");
        add(new JLabel("Invoice Number"));

        searchInvoiceNumber.setLayout(null);
        searchInvoiceNumber.setBounds(620,60,120,20);
        searchInvoiceNumber.setText("Invoice Number");
        add(searchInvoiceNumber);
        setVisible(true);

        //  public MenuTest() {


        menuBar = new JMenuBar();
        loadFile = new JMenuItem("upload File");
        saveFile = new JMenuItem("Save File");
        fileMenu = new JMenu("File");

        loadFile.addActionListener(this);
        loadFile.setActionCommand("upload File");
        saveFile.addActionListener(this);
        saveFile.setActionCommand("save file");
        fileMenu.add(loadFile);

        fileMenu.add(saveFile);
        menuBar.add(fileMenu);



        setJMenuBar(menuBar);
        setSize(400, 300);
        setLocation(200,200);

    }

    @Override
    public void actionPerformed(ActionEvent x) {
        switch (x.getActionCommand()){
            case  "upload file" :

                break;

            case "save file":

                break;
        }
    }



    void loadFile(){
        JFileChooser fc = new JFileChooser();
        int result=  fc.showOpenDialog(this);
        if (result== JFileChooser.APPROVE_OPTION) {
            String path = fc.getSelectedFile().getPath();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(path);
                int size = fis.available();
                byte[] b = new byte[size];
                fis.read(b);
                // x.setText(new String(b));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e){

                e.printStackTrace();
            }finally {
                try{ fis.close();}catch (IOException e){
                }


            }
        }
        //void saveFile(){


        setJMenuBar(menuBar);
        menuBar.setSize(400, 150);
        menuBar.setLocation(50, 50);






        JTable table = new JTable(data,cols);

        table.setBounds(50,50,400,200);

        add(table);

    }






    //Invoice Table



    /*@Override
    public void actionPerformed(ActionEvent S) {
         if (S.getSource().equals(btnCreateNewInvoice)){

        JOptionPane.showMessageDialog(null,"New Invoice is Created","dialog",JOptionPane.INFORMATION_MESSAGE);
    } else if (S.getSource().equals( btnDeleteInvoice)){
             JOptionPane.showMessageDialog(null,"Invoice is Deleted","dialog",JOptionPane.INFORMATION_MESSAGE);
         }

         }

*/
}

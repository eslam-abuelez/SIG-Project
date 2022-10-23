package table;

import javax.swing.*;

public class TableFrame extends JFrame {
    private JTable InvoiceDetails;
    private String[]cols= {"No.","Date","Customer","Total"};
    private  String[][]data={{"0","22-10-22","Islam", "SubZero"},
            {"0","22-10-22","Islam", "SubZero"}
            ,{null,null,null, null}
    };



    public TableFrame(){
       // super("Invoice Details");

        super("Invoice Details");

        JTable table = new JTable(data,cols);
        add(table);
    }
   // public static void main(String[] args) {
     //   new TableFrame().setVisible(true);
   // }
}

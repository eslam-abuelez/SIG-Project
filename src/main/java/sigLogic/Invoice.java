package sigLogic;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {

    ArrayList<Integer> invoiceNumber = new ArrayList<Integer>(); // Create an ArrayList for the invoices
    private Date date;
    private String customer;


    public Invoice(ArrayList<Integer> invoiceNumber, Date date, String customer) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.customer = customer;
    }

}

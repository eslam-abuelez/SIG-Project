package InvoiceFrameWithComponents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listner implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"New Voice is Created","dialog",JOptionPane.INFORMATION_MESSAGE);
    }


}

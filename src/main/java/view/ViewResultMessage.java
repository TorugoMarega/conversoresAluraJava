package view;

import javax.swing.*;

public class ViewResultMessage {
    public ViewResultMessage(String finalValueString) {
        JOptionPane.showMessageDialog(null, "O valor da conversão é de " + finalValueString);
    }
}

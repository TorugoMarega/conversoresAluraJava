package view;

import currencyConverter.CurrencyConverter;

import javax.swing.*;

public class ViewUserSetValueInput {
    private String userInputValue;
    public ViewUserSetValueInput(String iconPath){
        Icon icon = new ImageIcon(CurrencyConverter.class.getResource(iconPath));
        this.userInputValue = JOptionPane.showInputDialog(null,"Valor a ser convertido: ","Conversão", JOptionPane.PLAIN_MESSAGE,icon,  null, "").toString().replace("," , ".");
    }
    public String getUserInputValue() {
        return this.userInputValue;
    }
}

package main;

import currencyConverter.CurrencyConverter;
import view.ViewInvalidInput;

import javax.swing.*;



public class UserSetValueInput {
     Double amountInputValue;

    public void showViewSetValueNonNegativeZero(String iconPath) {
        try {
            Icon icon = new ImageIcon(CurrencyConverter.class.getResource(iconPath));

            Double amountInputDouble = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor a ser convertido: ","Conversão", JOptionPane.PLAIN_MESSAGE,icon,  null, "").toString().replace("," , "."));
            if (amountInputDouble <= 0){
                throw  new IllegalArgumentException();
            }
            else {
                this.amountInputValue = amountInputDouble;
            }
        } catch (IllegalArgumentException illegalArgumentException){
            illegalArgumentException.printStackTrace();

            ViewInvalidInput viewInvalidInput = new ViewInvalidInput();
            showViewSetValueNonNegativeZero(iconPath);
        }
    }

    public void showViewSetValueNegativeZero(String iconPath){
        try {
            Icon icon = new ImageIcon(CurrencyConverter.class.getResource(iconPath));

            Double amountInputDouble = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor a ser convertido: ","Conversão", JOptionPane.PLAIN_MESSAGE,icon,  null, "").toString().replace("," , "."));
            if (amountInputDouble == null){
                throw  new IllegalArgumentException();
            }
            else {
                this.amountInputValue = amountInputDouble;
            }
        } catch (IllegalArgumentException illegalArgumentException){
            illegalArgumentException.printStackTrace();

            ViewInvalidInput viewInvalidInput = new ViewInvalidInput();
            showViewSetValueNonNegativeZero(iconPath);
        }
    }
    public double getValue(){
        return this.amountInputValue;
    }
}

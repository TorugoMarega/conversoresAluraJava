package view;

import currencyConverter.CurrencyConverter;

import javax.swing.*;

public class ViewUserSetValueInput {
    public ViewUserSetValueInput(String iconPath){
        Icon icon = new ImageIcon(CurrencyConverter.class.getResource(iconPath));
    }
}

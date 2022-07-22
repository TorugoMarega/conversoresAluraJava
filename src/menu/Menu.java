package menu;

//import currencyConverter.CurrencyConverter;
import convert.Conversion;
import currencyConverter.CurrencyConverter;
import currencyConverter.CurrencyList;
import currencyConverter.ResultMessage;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Menu {
    public static void main(String[] args) {
        //UIManager.put("OptionPane.minimumSize",new Dimension(200,200));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Arial", Font.BOLD, 18)));

        Icon icon = new ImageIcon(Menu.class.getResource("/menu/img/menu.png"));

        String[] options = {"Conversor de Moeda", "Conversor de Temperatura"};

        try{
            String input = (String) JOptionPane.showInputDialog(null, "Escolha uma opção...",
                    "Menu", JOptionPane.DEFAULT_OPTION, icon, options, options[0]);

            switch (input){
                case "Conversor de Moeda":
                    CurrencyConverter currencyConverter = new CurrencyConverter();
                    break;
                case "Conversor de Temperatura":
                    System.out.println("Conversor de temperatura");
                    break;

                default: JOptionPane.showMessageDialog(null, "Programa finalizado", "Sair",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Programa finalizado", "Sair",JOptionPane.ERROR_MESSAGE);
        }
    }
}

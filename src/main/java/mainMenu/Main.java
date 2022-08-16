package mainMenu;
import controller.ConnectionFactory;
import data.CreateDatabase;
import view.ViewFinishMessage;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Arial", Font.BOLD, 18)));
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            CreateDatabase database = new CreateDatabase(connectionFactory);
            database.createTableCurrency();

            Menu menu = new Menu();
            menu.start();
        } catch (Exception ex) {
            new ViewFinishMessage();
        }
    }
}

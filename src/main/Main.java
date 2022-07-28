package main;

import view.img.FinishMessage;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Arial", Font.BOLD, 18)));
        try{
            Menu menu = new Menu();
            menu.start();
        }
        catch (Exception ex){
            System.out.println("CAIU NA MAIN");
            new FinishMessage();
        }
    }
}

package main;

import currencyConverter.CurrencyConverter;
import temperatureConverter.TemperatureConverter;
import view.ViewMenuDropDown;
import view.img.FinishMessage;

public class Menu {
    public void start(){
        String[] options = {"Conversor de Moeda", "Conversor de Temperatura"};
        ViewMenuDropDown MainMenu = new ViewMenuDropDown(options, "/view/img/menu.png","Escolha um conversor","Menu");
        switch (MainMenu.getInputString()){
            case "Conversor de Moeda":
                CurrencyConverter currencyConverter = new CurrencyConverter();
                break;
            case "Conversor de Temperatura":
                TemperatureConverter temperatureConverter = new TemperatureConverter();
                System.out.println("Conversor de temperatura");
                break;
            default: new FinishMessage();
        }
    }
}

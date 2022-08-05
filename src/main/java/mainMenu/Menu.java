package mainMenu;

import currencyConverter.CurrencyConverter;
import temperatureConverter.TemperatureConverter;
import view.FinishMessage;
import view.ViewContinueMessage;
import view.ViewMenuDropDown;

public class Menu {
    public void start() throws Exception {
        String[] options = {"Conversor de Moeda", "Conversor de Temperatura"};
        ViewMenuDropDown MainMenu = new ViewMenuDropDown(options, "/menu/menu.png","Escolha um conversor","Menu");
        switch (MainMenu.getInputString()){
            case "Conversor de Moeda":
                try{
                    new CurrencyConverter();
                }catch (Exception ex){
                    new ViewContinueMessage();
                }
                break;
            case "Conversor de Temperatura":
                try{
                    new TemperatureConverter();
                }catch (Exception ex){
                    ex.printStackTrace();
                    new  ViewContinueMessage();
                }

                break;
            default: new FinishMessage();
        }
    }
}

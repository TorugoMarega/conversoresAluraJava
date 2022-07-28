package view;

import main.Menu;
import view.img.FinishMessage;

import javax.swing.*;

public class ViewContinueMessage {
    public ViewContinueMessage(){

        Object[] options = { "Confirmar", "Cancelar" };
        Object optionSelected = JOptionPane.showOptionDialog(null, "Deseja retornar ao menu principal?", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if(optionSelected.equals(0)){
            Menu menu = new Menu();
            menu.start();
        }else{
            FinishMessage finishMessage = new FinishMessage();
        }
    }
}

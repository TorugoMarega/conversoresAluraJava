package view;

import javax.swing.*;

public class ViewMenuDropDown {
    private String inputReturn;
        public ViewMenuDropDown(String[] options, String iconPath, String textInputLabel, String titleWindow){

            Icon icon = new ImageIcon(ViewMenuDropDown.class.getResource(iconPath));
            try{
                String input = (String) JOptionPane.showInputDialog(null, textInputLabel,
                        titleWindow, JOptionPane.DEFAULT_OPTION, icon, options, options[0]);
                this.inputReturn = input;
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Programa finalizado", "Sair",JOptionPane.ERROR_MESSAGE);
            }
        }
        public String getInputString(){
            return inputReturn;
        }



}

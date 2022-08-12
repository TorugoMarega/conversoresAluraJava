package view;

import javax.swing.*;

public class ViewMenuDropDown {
    private String inputReturn;

    public ViewMenuDropDown(String[] options, String iconPath, String textInputLabel, String titleWindow) {

        Icon icon = new ImageIcon(ViewMenuDropDown.class.getResource(iconPath));

        String input = (String) JOptionPane.showInputDialog(null, textInputLabel,
                titleWindow, JOptionPane.DEFAULT_OPTION, icon, options, options[0]);
        this.inputReturn = input;
    }

    public String getInputString() {
        return inputReturn;
    }

}

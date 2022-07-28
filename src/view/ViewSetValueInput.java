package view;

import currencyConverter.CurrencyConverter;

import javax.swing.*;



public class ViewSetValueInput {
    private Double amountInputValue;

    public ViewSetValueInput(String iconPath){
        showViewSetValue(iconPath);
    }

    private void showViewSetValue(String iconPath) {
        try {
            Icon icon = new ImageIcon(CurrencyConverter.class.getResource(iconPath));

            double amountInputDouble = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor a ser convertido: ","Conversão", JOptionPane.PLAIN_MESSAGE,icon,  null, "").toString().replace("," , "."));
            if (amountInputDouble <= 0){
                throw  new IllegalArgumentException();
            }
            else {
                this.amountInputValue = amountInputDouble;
            }
        } catch (IllegalArgumentException illegalArgumentException){
            illegalArgumentException.printStackTrace();


            ViewInvalidInput viewInvalidInput = new ViewInvalidInput();
            showViewSetValue(iconPath);
        }
    }
    public double getValue(){
        return this.amountInputValue;
    }
}

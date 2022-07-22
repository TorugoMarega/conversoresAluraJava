package currencyConverter;


import convert.Conversion;

import javax.swing.*;
import java.text.DecimalFormat;

public class CurrencyConverter {
    private CurrencyList listOfCurrencies = new CurrencyList();

    public CurrencyList getListOfCurrencies(){
        return listOfCurrencies;
    }



    public int originCurrencySelection(){
        Icon iconOrigin = new ImageIcon(CurrencyConverter.class.getResource("/currencyConverter/img/moedaOrigem.png"));
        String inputCurrency = (String) JOptionPane.showInputDialog(null, "Escolha a moeda de origem...",
                "Moeda de Origem", JOptionPane.DEFAULT_OPTION, iconOrigin, listOfCurrencies.getCurrencyList(),
                listOfCurrencies.getCurrencyListStringPerIndex(0));

        int originCurrencyIndex=0;

        switch (inputCurrency){
            case "Real":
                originCurrencyIndex = 0;
            break;

            case "Dólar Comercial":
                originCurrencyIndex = 1;
            break;

            case "Euro":
                originCurrencyIndex = 2;
            break;

            case "Libra Esterlina":
                originCurrencyIndex = 3;
            break;

            case "Iene Japonês":
                originCurrencyIndex = 4;
            break;

            case "Yuan Chinês":
                originCurrencyIndex = 5;
            break;
        }
        //System.out.println("ORIGIN VALUE" + originCurrencyIndex);
        return originCurrencyIndex;
    }

    public int destinationCurrencySelection(){
        Icon iconDestination = new ImageIcon(CurrencyConverter.class.getResource("/currencyConverter/img/moedaDestino.png"));
        String destinationCurrency = (String) JOptionPane.showInputDialog(null, "Escolha a moeda de destino...",
                "Moeda de Destino", JOptionPane.DEFAULT_OPTION, iconDestination, listOfCurrencies.getCurrencyList(),
                listOfCurrencies.getCurrencyListStringPerIndex(0));

        int destinationCurrencyIndex=0;

        switch (destinationCurrency){
            case "Real":
                destinationCurrencyIndex = 0;
                break;

            case "Dólar Comercial":
                destinationCurrencyIndex = 1;
                break;

            case "Euro":
                destinationCurrencyIndex = 2;
                break;

            case "Libra Esterlina":
                destinationCurrencyIndex = 3;
                break;

            case "Iene Japonês":
                destinationCurrencyIndex = 4;
                break;

            case "Yuan Chinês":
                destinationCurrencyIndex = 5;
                break;
        }
        //System.out.println("ORIGIN VALUE" + destinationCurrencyIndex);
        return destinationCurrencyIndex;
    }

    public double setAmount(){
        Icon icon = new ImageIcon(CurrencyConverter.class.getResource("/currencyConverter/img/moedaConvertida.png"));
        double amountInput = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor a ser convertido: ","Conversão", JOptionPane.PLAIN_MESSAGE,icon,  null, "").toString());

        //System.out.println("Valor de entrada: "+amountInput);
        return  amountInput;
    }
    public CurrencyConverter() {
        int originIndex = originCurrencySelection();
        int destinationIndex = destinationCurrencySelection();
        double amount = setAmount();

        Currency originCurrency = listOfCurrencies.getCurrencyPerIndex(originIndex);
        Currency destinationCurrency = listOfCurrencies.getCurrencyPerIndex(destinationIndex);

        Conversion conversion = new Conversion(amount, originCurrency.getValue(), destinationCurrency.getValue());
        DecimalFormat df = new DecimalFormat("##.##");

        String finalConversionMessage=destinationCurrency.getSigla()+" "+df.format(conversion.getFinalValue());
        ResultMessage resultCurrencyConversion = new ResultMessage(finalConversionMessage);
    }

}

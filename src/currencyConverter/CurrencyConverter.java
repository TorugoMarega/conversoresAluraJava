package currencyConverter;

import conversion.Conversion;
import measure.Currency;
import view.ViewContinueMessage;
import view.ViewMenuDropDown;
import view.ViewResultMessage;
import main.UserSetValueInput;

import java.math.BigDecimal;


public class CurrencyConverter {
    public CurrencyConverter() throws Exception{

            int originIndex = originCurrencySelection();
            int destinationIndex = outputCurrencySelection();
            Currency originCurrency = listOfCurrencies.getCurrencyPerIndex(originIndex);
            Currency destinationCurrency = listOfCurrencies.getCurrencyPerIndex(destinationIndex);


            BigDecimal amount = setAmount();

            Conversion conversion = new Conversion();
            conversion.convertMonetaryValues(amount, originCurrency.getValue(), destinationCurrency.getValue());
            Conversion conversion1 = new Conversion();

            //DecimalFormat decimalFormat = new DecimalFormat("##.##");
            //String finalConversionMessage=destinationCurrency.getSymbol()+" "+decimalFormat.format(conversion.getFinalValue());

            String finalConversionMessage=destinationCurrency.getSymbol()+" "+String.format("%.2f",conversion.getFinalValue()).replace(".",",");

            ViewResultMessage resultCurrencyConversion = new ViewResultMessage(finalConversionMessage);
            new ViewContinueMessage();
    }

    private CurrencyList listOfCurrencies = new CurrencyList();

    private CurrencyList getListOfCurrencies(){
        return listOfCurrencies;
    }

    private int originCurrencySelection(){
        ViewMenuDropDown currencyInputMenu = new ViewMenuDropDown(listOfCurrencies.getCurrencyList(), "/currencyConverter/img/moedaOrigem.png","Escolha a moeda de origem:","Moeda de Origem" );
        String inputCurrency = currencyInputMenu.getInputString();
        int originCurrencyIndex=switchCurrency(inputCurrency);
        //System.out.println("ORIGIN VALUE" + originCurrencyIndex);
        return originCurrencyIndex;
    }

    private int switchCurrency(String inputCurrency){
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
        return originCurrencyIndex;
    }
    private int outputCurrencySelection(){
        ViewMenuDropDown currencyOutputMenu = new ViewMenuDropDown(listOfCurrencies.getCurrencyList(), "/currencyConverter/img/moedaDestino.png","Escolha a moeda de destino:","Moeda de Destino" );
        String outputCurrency = currencyOutputMenu.getInputString();
        int outputCurrencyIndex=switchCurrency(outputCurrency);
        //System.out.println("DESTINATION VALUE" + outputCurrencyIndex);
        return outputCurrencyIndex;
    }
    private BigDecimal setAmount(){
        UserSetValueInput userSetValueInput = new UserSetValueInput();
        userSetValueInput.showViewSetValueNonNegativeZero("/currencyConverter/img/moedaConvertida.png");
        BigDecimal amountInput = BigDecimal.valueOf(userSetValueInput.getValue());
        return  amountInput;
    }



}

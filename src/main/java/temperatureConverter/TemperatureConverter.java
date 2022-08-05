package temperatureConverter;

import conversion.Conversion;
import mainMenu.UserSetValueInput;
import measure.Temperature;
import view.ViewContinueMessage;
import view.ViewMenuDropDown;
import view.ViewResultMessage;

import java.math.BigDecimal;

public class TemperatureConverter {
    public TemperatureConverter() throws Exception {
        int originIndex = originTemperatureSelection();
        int destinationIndex = outputTemperatureSelection();
        Temperature originTemperature = listOfTemperatures.getTemperaturePerIndex(originIndex);
        Temperature destinationTemperature = listOfTemperatures.getTemperaturePerIndex(destinationIndex);
        BigDecimal amount = setAmount();

        Conversion conversion = new Conversion();

        //DecimalFormat decimalFormat = new DecimalFormat("##.##");
        //String finalConversionMessage=destinationCurrency.getSymbol()+" "+decimalFormat.format(conversion.getFinalValue());
        conversion.convertTemperatureValues(amount.doubleValue(),originIndex, destinationIndex);
        String finalConversionMessage=destinationTemperature.getSymbol()+" "+String.format("%.2f",conversion.getFinalValue()).replace(".",",");

        ViewResultMessage resultTemperatureConversion = new ViewResultMessage(finalConversionMessage);
        new ViewContinueMessage();
    }

    private TemperatureList listOfTemperatures = new TemperatureList();

    private TemperatureList getListOfTemperatures(){
        return listOfTemperatures;
    }

    private int originTemperatureSelection(){
        ViewMenuDropDown temperatureInputMenu = new ViewMenuDropDown(listOfTemperatures.getTemperatureList(), "/temperature/inputTemperature.png","Escolha a escala da temperatura:","Temperatura de Entrada" );
        String inputTemperature = temperatureInputMenu.getInputString();
        int originTemperatureIndex=switchTemperature(inputTemperature);

        return originTemperatureIndex;
    }

    private int switchTemperature(String inputTemperature){
        int originTemperatureIndex=0;
        switch (inputTemperature){
            case "Fareinheint":
                originTemperatureIndex = 0;
                break;

            case "Celcius":
                originTemperatureIndex = 1;
                break;

            case "Kelvin":
                originTemperatureIndex = 2;
                break;
        }
        return originTemperatureIndex;
    }
    private int outputTemperatureSelection(){
        ViewMenuDropDown temperatureOutputMenu = new ViewMenuDropDown(listOfTemperatures.getTemperatureList(), "/temperature/outputTemperature.png","Escolha a escala de destino:","Temperatura de Saída" );
        String outputTemperature = temperatureOutputMenu.getInputString();
        int outputTemperatureIndex=switchTemperature(outputTemperature);
        //System.out.println("outputemperatureindex: " +outputTemperatureIndex);
        return outputTemperatureIndex;
    }
    private BigDecimal setAmount(){
        UserSetValueInput viewSetValueInputTemperature = new UserSetValueInput();
        viewSetValueInputTemperature.showViewSetValueNegativeZero("/temperature/amountTemperature.png");

        BigDecimal amountInput = BigDecimal.valueOf(viewSetValueInputTemperature.getValue());
        return  amountInput;
    }
}

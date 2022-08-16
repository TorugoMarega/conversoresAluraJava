package timeConverter;


import conversion.Conversion;
import mainMenu.UserSetValueInput;
import model.Time;
import view.ViewContinueMessage;
import view.ViewMenuDropDown;
import view.ViewResultMessage;

import java.math.BigDecimal;

public class TimeConverter {

    public TimeConverter() throws Exception{
        int originIndex = originTimeSelection();
        int destinationIndex = outputTimeSelection();
        Time originTime = listOfTime.getTimePerIndex(originIndex);
        Time destinationTime = listOfTime.getTimePerIndex(destinationIndex);

        BigDecimal amount = setAmount();

        Conversion conversion = new Conversion();
        conversion.convertMonetaryValues(amount, originTime.getValue(), destinationTime.getValue());
        //DecimalFormat decimalFormat = new DecimalFormat("##.##");
        //String finalConversionMessage=destinationCurrency.getSymbol()+" "+decimalFormat.format(conversion.getFinalValue());

        String finalConversionMessage = destinationTime.getSymbol() + " " + String.format("%.2f", conversion.getFinalValue()).replace(".", ",");
        ViewResultMessage resultTimeConversion = new ViewResultMessage(finalConversionMessage);
        new ViewContinueMessage();
    }

    private TimeList listOfTime = new TimeList();

    private TimeList getListOfTime() {
        return listOfTime;
    }

    private int originTimeSelection() {
        ViewMenuDropDown timeInputMenu = new ViewMenuDropDown(listOfTime.getTimeList(), "/time/tempoOrigem.png", "Escolha a unidade de tempo de origem:", "Tempo de Origem");
        String inputTime = timeInputMenu.getInputString();
        int originTimeIndex = switchTime(inputTime);
        return originTimeIndex;
    }

    private int switchTime(String inputTime) {
        int originTimeIndex = 0;
        switch (inputTime) {
            case "Segundos":
                originTimeIndex = 0;
                break;

            case "Minutos":
                originTimeIndex = 1;
                break;

            case "Horas":
                originTimeIndex = 2;
                break;

            case "Dias":
                originTimeIndex = 3;
                break;
        }
        return originTimeIndex;
    }

    private int outputTimeSelection() {
        ViewMenuDropDown timeOutputMenu = new ViewMenuDropDown(listOfTime.getTimeList(), "/time/tempoDestino.png", "Escolha a unidade de tempo de destino:", "Tempo de Destino");
        String outputTime = timeOutputMenu.getInputString();
        int outputTimeIndex = switchTime(outputTime);
        return outputTimeIndex;
    }

    private BigDecimal setAmount() {
        UserSetValueInput userSetValueInput = new UserSetValueInput();
        userSetValueInput.showViewSetValueNonNegativeZero("/time/tempoConvertido.png");
        BigDecimal amountInput = BigDecimal.valueOf(userSetValueInput.getValue());
        return amountInput;
    }
}




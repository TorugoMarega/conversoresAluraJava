package conversion;

import temperatureConverter.Scales;
import view.ViewInvalidInput;

import java.math.BigDecimal;

public class Conversion {
    private BigDecimal finalValue;


    public void convertMonetaryValues(BigDecimal inputValue, BigDecimal baseValueInput, BigDecimal baseValueOutput){
        System.out.println("VALOR DE ENTRADA: "+ inputValue+ "\nVALOR BASE DA ENTRADA "+baseValueInput);
        System.out.println("VALOR BASE OUTPUT: "+baseValueOutput);
        BigDecimal convertedValue =  BigDecimal.valueOf(inputValue.doubleValue()/baseValueInput.doubleValue());
        //return inputValue.divide(baseValueInput);
        this.finalValue =  convertedValue.multiply(baseValueOutput);
    }

    public void convertTemperatureValues(Double inputValue, int inputScaleIndex, int outputScaleIndex){
        System.out.println("VALOR DE ENTRADA: "+ inputValue);
        System.out.println("ESCALA DE ENTRADA: "+inputScaleIndex);
        System.out.println("ESCALA DE SAIDA: "+outputScaleIndex);
        String escaladeentrada = "ESCALA DE ENTRADA";
        String escaladesaida = "ESCALA DE SAIDA";
        if(inputScaleIndex == 0 ){
            System.out.println(escaladeentrada + " FAREINHEINT");
        }else if (inputScaleIndex == 1){
            System.out.println(escaladeentrada + " CELCIUS");
        }else if (inputScaleIndex ==2){
            System.out.println(escaladeentrada + " KELVIN");
        }
        if(outputScaleIndex == 0 ){
            System.out.println(escaladesaida + " FAREINHEINT");
        }else if (outputScaleIndex == 1){
            System.out.println(escaladesaida + " CELCIUS");
        }else if (outputScaleIndex ==2){
            System.out.println(escaladesaida + " KELVIN");
        }

        Scales scalesConversion = new Scales();
        Double convertedValue;
        if (inputScaleIndex == 0 && outputScaleIndex == 1 || inputScaleIndex == 1 && outputScaleIndex == 0){

            convertedValue = scalesConversion.celciusFareinheint(inputValue, inputScaleIndex);
        }else if(inputScaleIndex == 1 && outputScaleIndex == 2 || inputScaleIndex == 2 && outputScaleIndex == 1){
            System.out.println("CELSIUS PARA kelvin OU kelvin PRA CELSIUS");
            convertedValue = scalesConversion.celciusKelvin(inputValue, inputScaleIndex);
        }else{
            convertedValue = scalesConversion.fareinheintKelvin(inputValue, inputScaleIndex);
            System.out.println("kelvin PARA FAREINHEINT OU FAREINHEINT PRA kelvin");
        }
        this.finalValue = BigDecimal.valueOf(convertedValue) ;
    }
    public Double getFinalValue(){

        System.out.println("VALOR FINAL: " + String.format("%.2f", this.finalValue.doubleValue()));
        return this.finalValue.doubleValue();

        /*
        System.out.println("VALOR FINAL BIG DECIMAL: "+ this.finalValue);
        return this.finalValue;
        */

    }


}

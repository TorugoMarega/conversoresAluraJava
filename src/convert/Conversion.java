package convert;

import java.math.BigDecimal;

public class Conversion {
    private BigDecimal finalValue;
    public Conversion(BigDecimal inputValue, BigDecimal baseValueInput, BigDecimal baseValueOutput){
        convertValues( inputValue,  baseValueInput, baseValueOutput);
    }
    private BigDecimal changeBaseValueToDollar(BigDecimal inputValue, BigDecimal baseValueInput){
        System.out.println("VALOR DE ENTRADA: "+ inputValue+ "\nVALOR BASE DA ENTRADA "+baseValueInput);
        //return inputValue.divide(baseValueInput);
        return BigDecimal.valueOf(inputValue.doubleValue()/baseValueInput.doubleValue());
    }
    private void convertValues(BigDecimal inputValue, BigDecimal baseValueInput,BigDecimal baseValueOutput){
        BigDecimal convertedValue = changeBaseValueToDollar( inputValue,  baseValueInput);

       //System.out.println("VALOR BASE OUTPUT: "+baseValueOutput);
      this.finalValue =  convertedValue.multiply(baseValueOutput);
    }
    public Double getFinalValue(){
        System.out.println("VALOR FINAL: " + String.format("%.2f", this.finalValue.doubleValue()));
        return this.finalValue.doubleValue();

        //System.out.println("VALOR FINAL BIG DECIMAL: "+ this.finalValue);
        //return this.finalValue;
    }


}

package convert;

public class Conversion {
    private double finalValue;

    public void convertValues(double inputValue, double baseValueInput, double baseValueOutput){
      this.finalValue = (inputValue*baseValueOutput)/baseValueInput;
    }
    public Conversion(double inputValue, double baseValueInput, double baseValueOutput){
        convertValues(inputValue,baseValueInput,baseValueOutput);
    }

    public double getFinalValue(){
        return this.finalValue;
    }
}

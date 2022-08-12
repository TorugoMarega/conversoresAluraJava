package temperatureConverter;

public class Scales {
    public Double celciusFareinheint(Double input, int scaleIndex) {
        Double result = 0.0;
        if (scaleIndex == 1) {
            result = (input * 9 / 5) + 32;
        } else if (scaleIndex == 0) {
            result = (input - 32) * 5 / 9;
        }
        return result;
    }

    public Double celciusKelvin(Double input, int scaleIndex) {
        Double result = 0.0;
        if (scaleIndex == 1) {
            result = input + 273.15;
        } else if (scaleIndex == 2) {
            result = input - 273.15;
        }
        return result;
    }

    public Double fareinheintKelvin(Double input, int scaleIndex) {
        Double result = 0.0;
        if (scaleIndex == 0) {
            result = (input - 32) * 5 / 9 + 273.15;
        } else if (scaleIndex == 2) {
            result = (input - 273.15) * 9 / 5 + 32;
        }
        return result;
    }
}

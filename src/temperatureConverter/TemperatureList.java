package temperatureConverter;


import measure.Temperature;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TemperatureList {
    List<Temperature> temperatureList;

    public TemperatureList(){
        List<Temperature> temperatureList = new ArrayList<>();
        this.temperatureList = temperatureList;
        Temperature farenheit = new Temperature("Fareinheint","°F", BigDecimal.valueOf(32));
        Temperature celcius = new Temperature("Celcius","°C", BigDecimal.valueOf(0));
        Temperature kelvin = new Temperature("Kelvin","K", BigDecimal.valueOf(273.15));

        temperatureList.add(farenheit);
        temperatureList.add(celcius);
        temperatureList.add(kelvin);
    }

    //RETORNA A REFERÊNCIA PARA A LISTA DE MOEDAS
    public List getTemperatureListReference(){
        return this.temperatureList;
    }
    public Temperature getTemperaturePerIndex(int index){
        return this.temperatureList.get(index);
    }
    public String[] getTemperatureList() {
        String [] allTemperatures = new String[temperatureList.size()];
        for(int i=0; i < temperatureList.size(); i++){
            allTemperatures[i] = temperatureList.get(i).getName();
        }
        return allTemperatures;
    }

    public String getTemperatureListStringPerIndex(int index) {
        String [] allTemperatures = new String[temperatureList.size()];
        for(int i=0; i < temperatureList.size(); i++){
            allTemperatures[i] = temperatureList.get(i).getName();
        }
        return allTemperatures[index];
    }
}


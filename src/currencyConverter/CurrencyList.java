package currencyConverter;

import measure.Currency;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CurrencyList {
    List <Currency> currencyList;
    public CurrencyList( ) {
        List <Currency> currencyList = new ArrayList<>();
        this.currencyList = currencyList;
        Currency real = new Currency("Real","R$", BigDecimal.valueOf(5.202));
        Currency dolarAmericano = new Currency("Dólar Comercial", "$",  BigDecimal.valueOf(1));
        Currency euro = new Currency("Euro","€",  BigDecimal.valueOf(0.9788));
        Currency libra = new Currency("Libra Esterlina", "£",  BigDecimal.valueOf(0.83156));
        Currency iene = new Currency("Iene Japonês", "¥",  BigDecimal.valueOf(136.491));
        Currency yuan = new Currency("Yuan Chinês", "¥",  BigDecimal.valueOf(6.75352));

        currencyList.add(real);
        currencyList.add(dolarAmericano);
        currencyList.add(euro);
        currencyList.add(libra);
        currencyList.add(iene);
        currencyList.add(yuan);
    }

    //RETORNA A REFERÊNCIA PARA A LISTA DE MOEDAS
    public List getCurrencyListReference(){
        return this.currencyList;
    }

    public Currency getCurrencyPerIndex(int index){
        return this.currencyList.get(index);
    }

    public String[] getCurrencyList() {
        String [] allCurrencies = new String[currencyList.size()];
        for(int i=0; i < currencyList.size(); i++){
            allCurrencies[i] = currencyList.get(i).getName();
            //System.out.println(allCurrencies[i]);
        }
        return allCurrencies;
    }

    public String getCurrencyListStringPerIndex(int index) {
        String [] allCurrencies = new String[currencyList.size()];
        for(int i=0; i < currencyList.size(); i++){
            allCurrencies[i] = currencyList.get(i).getName();
            //System.out.println(allCurrencies[i]);
        }
        return allCurrencies[index];
    }



    public void addCurrency(Currency newCurrency){
        currencyList.add(newCurrency);
    }
    public void removeCurrency(int index){
        currencyList.remove(index);
    }
}

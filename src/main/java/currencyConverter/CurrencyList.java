package currencyConverter;

import DAO.CurrencyDAO;
import model.Currency;

import java.math.BigDecimal;
import java.util.List;

public class CurrencyList {
    List<Currency> currencyList;

    public CurrencyList() {
        CurrencyDAO currencyDAO = new CurrencyDAO();
        initializeCurrencies();
        List<Currency> currencyList = currencyDAO.selectAll();
        this.currencyList = currencyList;
//        Currency real = new Currency(1,"Real", "R$", BigDecimal.valueOf(5.211));
//        Currency dolarAmericano = new Currency(2,"Dólar Comercial", "$", BigDecimal.valueOf(1));
//        Currency euro = new Currency(3,"Euro", "€", BigDecimal.valueOf(0.976));
//        Currency libra = new Currency(4,"Libra Esterlina", "£", BigDecimal.valueOf(0.822));
//        Currency iene = new Currency(5,"Iene Japonês", "¥", BigDecimal.valueOf(136.491));
//        Currency yuan = new Currency(6,"Yuan Chinês", "¥", BigDecimal.valueOf(6.75352));

//        currencyList.add(real);
//        currencyList.add(dolarAmericano);
//        currencyList.add(euro);
//        currencyList.add(libra);
//        currencyList.add(iene);
//        currencyList.add(yuan);
    }

    //RETORNA A REFERÊNCIA PARA A LISTA DE MOEDAS
    public List getCurrencyListReference() {
        return this.currencyList;
    }

    public Currency getCurrencyPerIndex(int index) {
        return this.currencyList.get(index);
    }

    public String[] getCurrencyList() {
        String[] allCurrencies = new String[currencyList.size()];
        for (int i = 0; i < currencyList.size(); i++) {
            allCurrencies[i] = currencyList.get(i).getName();
            //System.out.println(allCurrencies[i]);
        }
        return allCurrencies;
    }

    private void initializeCurrencies(){
        CurrencyDAO currencyDAO = new CurrencyDAO();
        System.out.println("------------------------------------------------------------");
        List <Currency> resultQuery = currencyDAO.selectAll();
        if(resultQuery.isEmpty()){
            System.out.println("LISTA VAZIA");
            Currency real = new Currency(1,"Real", "R$", BigDecimal.valueOf(5.211));
            Currency dolarAmericano = new Currency(2,"Dólar Comercial", "$", BigDecimal.valueOf(1));
            Currency euro = new Currency(3,"Euro", "€", BigDecimal.valueOf(0.976));
            Currency libra = new Currency(4,"Libra Esterlina", "£", BigDecimal.valueOf(0.822));
            Currency iene = new Currency(5,"Iene Japonês", "¥", BigDecimal.valueOf(136.491));
            Currency yuan = new Currency(6,"Yuan Chinês", "¥", BigDecimal.valueOf(6.75352));

            currencyDAO.insertCurrency(real);
            currencyDAO.insertCurrency(dolarAmericano);
            currencyDAO.insertCurrency(euro);
            currencyDAO.insertCurrency(libra);
            currencyDAO.insertCurrency(iene);
            currencyDAO.insertCurrency(yuan);
        }else{
            System.out.println("LISTA CHEIA");
        }

    }

    public String getCurrencyListStringPerIndex(int index) {
        String[] allCurrencies = new String[currencyList.size()];
        for (int i = 0; i < currencyList.size(); i++) {
            allCurrencies[i] = currencyList.get(i).getName();
            //System.out.println(allCurrencies[i]);
        }
        return allCurrencies[index];
    }


    public void addCurrency(Currency newCurrency) {
        currencyList.add(newCurrency);
    }

    public void removeCurrency(int index) {
        currencyList.remove(index);
    }
}


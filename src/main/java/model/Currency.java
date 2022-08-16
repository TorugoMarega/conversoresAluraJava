package model;

import java.math.BigDecimal;

public class Currency extends Measure {

    public Currency(){
     super();
    }
    public Currency(int id,String name, String symbol, BigDecimal value) {
        super(id,name, symbol, value);
    }
}

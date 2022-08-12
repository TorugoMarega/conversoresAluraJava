package model;

import java.math.BigDecimal;

public class Currency extends Measure {

    public Currency(){
     super();
    }
    public Currency(Integer id,String name, String sigla, BigDecimal value) {
        super(id,name, sigla, value);
    }
}

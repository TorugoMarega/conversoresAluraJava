package model;

import java.math.BigDecimal;

public class Temperature extends Measure {
    public Temperature(Integer id,String name, String sigla, BigDecimal value) {
        super(id,name, sigla, value);
    }
}

package measure;

import measure.Measure;

import java.math.BigDecimal;

public class Currency extends Measure {
    public Currency(String name, String sigla, BigDecimal value) {
        super(name, sigla, value);
    }
}

package measure;


import java.math.BigDecimal;

abstract class Measure {
    private String name;
    private String symbol;
    private BigDecimal value;

    public Measure (String name, String symbol, BigDecimal value) {
        this.name = name;
        this.symbol = symbol;
        this.value =value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}

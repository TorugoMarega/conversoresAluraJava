package model;


import java.math.BigDecimal;

abstract class Measure {

    private int id;
    private String name;
    private String symbol;
    private BigDecimal value;

    public Measure(){}
    public Measure(int id, String name, String symbol, BigDecimal value) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setid(int rowid) {
        this.id = rowid;
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

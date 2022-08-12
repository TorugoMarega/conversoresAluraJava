package model;


import java.math.BigDecimal;

abstract class Measure {

    private int rowid;
    private String name;
    private String symbol;
    private BigDecimal value;

    public Measure(){}
    public Measure(int rowid, String name, String symbol, BigDecimal value) {
        this.rowid = rowid;
        this.name = name;
        this.symbol = symbol;
        this.value = value;
    }

    public int getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
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
